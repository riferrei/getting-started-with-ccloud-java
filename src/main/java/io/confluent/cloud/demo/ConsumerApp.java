package io.confluent.cloud.demo;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializer;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializerConfig;
import io.confluent.cloud.demo.domain.SensorDataImpl.SensorData;

import static io.confluent.cloud.demo.utils.KafkaUtils.TOPIC;
import static io.confluent.cloud.demo.utils.KafkaUtils.createTopic;
import static io.confluent.cloud.demo.utils.KafkaUtils.getConfigs;

public class ConsumerApp {

    private void run(Properties configs) {

        // Add the deserializer configuration for the key and value
        configs.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
            StringDeserializer.class.getName());
        configs.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
            KafkaProtobufDeserializer.class.getName());

        // Instructs the deserializer to perform deserialization using the
        // specific value type instead of using the 'DynamicMessage' type.
        configs.setProperty(KafkaProtobufDeserializerConfig.SPECIFIC_PROTOBUF_VALUE_TYPE,
            SensorData.class.getName());

        // Set other standard properties for the Kafka consumer
        configs.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        configs.setProperty(ConsumerConfig.GROUP_ID_CONFIG, ConsumerApp.class.getName());

        try (KafkaConsumer<String, SensorData> consumer = new KafkaConsumer<>(configs)) {

            consumer.subscribe(Arrays.asList(TOPIC));

            for (;;) {

                ConsumerRecords<String, SensorData> records =
                    consumer.poll(Duration.ofSeconds(Integer.MAX_VALUE));

                for (ConsumerRecord<String, SensorData> record : records) {
                    SensorData sensorData = record.value();
                    StringBuilder sb = new StringBuilder();
                    sb.append("deviceID.....: ").append(sensorData.getDeviceID()).append("\n");
                    sb.append("enabled......: ").append(sensorData.getEnabled()).append("\n");
                    sb.append("reading......: ").append(sensorData.getReading()).append("\n");
                    System.out.println(sb.toString());
                }

            }

        }

    }

    public static void main(String[] args) {
        createTopic(TOPIC, 4, (short) 3);
        new ConsumerApp().run(getConfigs());
    }

}
