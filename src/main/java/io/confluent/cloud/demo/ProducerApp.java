package io.confluent.cloud.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializer;
import io.confluent.cloud.demo.domain.SensorDataImpl.SensorData;

import static io.confluent.cloud.demo.utils.KafkaUtils.TOPIC;
import static io.confluent.cloud.demo.utils.KafkaUtils.createTopic;
import static io.confluent.cloud.demo.utils.KafkaUtils.getConfigs;

public class ProducerApp {

    private void run(Properties configs) {

        // Add the serializer configuration for the key and value
        configs.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
            StringSerializer.class.getName());
        configs.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
            KafkaProtobufSerializer.class.getName());

        try (KafkaProducer<String, SensorData> producer = new KafkaProducer<>(configs)) {

            for (;;) {

                // Randomly pick a device id from the list
                int index = RANDOM.nextInt(DEVICES.size()-1);
                String recordKey = DEVICES.get(index);

                // Create a new record with a random reading
                ProducerRecord<String, SensorData> record =
                    new ProducerRecord<>(TOPIC, recordKey,
                        SensorData.newBuilder()
                            .setDeviceID(recordKey)
                            .setEnabled(RANDOM.nextBoolean())
                            .setReading(RANDOM.nextDouble())
                            .build());

                // Write the reading data to the topic's partition
                producer.send(record, (metadata, exception) -> {
                    System.out.println(String.format(
                        "Reading sent to partition %d with offset %d",
                        metadata.partition(), metadata.offset()));
                });

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                }

            }

        }

    }

    private static final Random RANDOM = new Random(System.currentTimeMillis());

    private static final List<String> DEVICES = Arrays.asList(
        UUID.randomUUID().toString(), UUID.randomUUID().toString(),
        UUID.randomUUID().toString(), UUID.randomUUID().toString(),
        UUID.randomUUID().toString(), UUID.randomUUID().toString()
    );

    public static void main(String[] args) {
        createTopic(TOPIC, 4, (short) 3);
        new ProducerApp().run(getConfigs());
    }

}
