// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensorData.proto

package io.confluent.cloud.demo.domain;

public final class SensorDataImpl {
  private SensorDataImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SensorDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:io.confluent.cloud.demo.domain.SensorData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string deviceID = 1;</code>
     * @return The deviceID.
     */
    java.lang.String getDeviceID();
    /**
     * <code>string deviceID = 1;</code>
     * @return The bytes for deviceID.
     */
    com.google.protobuf.ByteString
        getDeviceIDBytes();

    /**
     * <code>bool enabled = 2;</code>
     * @return The enabled.
     */
    boolean getEnabled();

    /**
     * <code>double reading = 3;</code>
     * @return The reading.
     */
    double getReading();
  }
  /**
   * Protobuf type {@code io.confluent.cloud.demo.domain.SensorData}
   */
  public  static final class SensorData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:io.confluent.cloud.demo.domain.SensorData)
      SensorDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SensorData.newBuilder() to construct.
    private SensorData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SensorData() {
      deviceID_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SensorData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SensorData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              deviceID_ = s;
              break;
            }
            case 16: {

              enabled_ = input.readBool();
              break;
            }
            case 25: {

              reading_ = input.readDouble();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.confluent.cloud.demo.domain.SensorDataImpl.internal_static_io_confluent_cloud_demo_domain_SensorData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.confluent.cloud.demo.domain.SensorDataImpl.internal_static_io_confluent_cloud_demo_domain_SensorData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.confluent.cloud.demo.domain.SensorDataImpl.SensorData.class, io.confluent.cloud.demo.domain.SensorDataImpl.SensorData.Builder.class);
    }

    public static final int DEVICEID_FIELD_NUMBER = 1;
    private volatile java.lang.Object deviceID_;
    /**
     * <code>string deviceID = 1;</code>
     * @return The deviceID.
     */
    public java.lang.String getDeviceID() {
      java.lang.Object ref = deviceID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceID_ = s;
        return s;
      }
    }
    /**
     * <code>string deviceID = 1;</code>
     * @return The bytes for deviceID.
     */
    public com.google.protobuf.ByteString
        getDeviceIDBytes() {
      java.lang.Object ref = deviceID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ENABLED_FIELD_NUMBER = 2;
    private boolean enabled_;
    /**
     * <code>bool enabled = 2;</code>
     * @return The enabled.
     */
    public boolean getEnabled() {
      return enabled_;
    }

    public static final int READING_FIELD_NUMBER = 3;
    private double reading_;
    /**
     * <code>double reading = 3;</code>
     * @return The reading.
     */
    public double getReading() {
      return reading_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getDeviceIDBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deviceID_);
      }
      if (enabled_ != false) {
        output.writeBool(2, enabled_);
      }
      if (reading_ != 0D) {
        output.writeDouble(3, reading_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getDeviceIDBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deviceID_);
      }
      if (enabled_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, enabled_);
      }
      if (reading_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, reading_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.confluent.cloud.demo.domain.SensorDataImpl.SensorData)) {
        return super.equals(obj);
      }
      io.confluent.cloud.demo.domain.SensorDataImpl.SensorData other = (io.confluent.cloud.demo.domain.SensorDataImpl.SensorData) obj;

      if (!getDeviceID()
          .equals(other.getDeviceID())) return false;
      if (getEnabled()
          != other.getEnabled()) return false;
      if (java.lang.Double.doubleToLongBits(getReading())
          != java.lang.Double.doubleToLongBits(
              other.getReading())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + DEVICEID_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceID().hashCode();
      hash = (37 * hash) + ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEnabled());
      hash = (37 * hash) + READING_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getReading()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.confluent.cloud.demo.domain.SensorDataImpl.SensorData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.cloud.demo.domain.SensorDataImpl.SensorData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.cloud.demo.domain.SensorDataImpl.SensorData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.cloud.demo.domain.SensorDataImpl.SensorData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.cloud.demo.domain.SensorDataImpl.SensorData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.cloud.demo.domain.SensorDataImpl.SensorData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.cloud.demo.domain.SensorDataImpl.SensorData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.cloud.demo.domain.SensorDataImpl.SensorData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.cloud.demo.domain.SensorDataImpl.SensorData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.confluent.cloud.demo.domain.SensorDataImpl.SensorData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.cloud.demo.domain.SensorDataImpl.SensorData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.cloud.demo.domain.SensorDataImpl.SensorData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.confluent.cloud.demo.domain.SensorDataImpl.SensorData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code io.confluent.cloud.demo.domain.SensorData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:io.confluent.cloud.demo.domain.SensorData)
        io.confluent.cloud.demo.domain.SensorDataImpl.SensorDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.confluent.cloud.demo.domain.SensorDataImpl.internal_static_io_confluent_cloud_demo_domain_SensorData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.confluent.cloud.demo.domain.SensorDataImpl.internal_static_io_confluent_cloud_demo_domain_SensorData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.confluent.cloud.demo.domain.SensorDataImpl.SensorData.class, io.confluent.cloud.demo.domain.SensorDataImpl.SensorData.Builder.class);
      }

      // Construct using io.confluent.cloud.demo.domain.SensorDataImpl.SensorData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        deviceID_ = "";

        enabled_ = false;

        reading_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.confluent.cloud.demo.domain.SensorDataImpl.internal_static_io_confluent_cloud_demo_domain_SensorData_descriptor;
      }

      @java.lang.Override
      public io.confluent.cloud.demo.domain.SensorDataImpl.SensorData getDefaultInstanceForType() {
        return io.confluent.cloud.demo.domain.SensorDataImpl.SensorData.getDefaultInstance();
      }

      @java.lang.Override
      public io.confluent.cloud.demo.domain.SensorDataImpl.SensorData build() {
        io.confluent.cloud.demo.domain.SensorDataImpl.SensorData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.confluent.cloud.demo.domain.SensorDataImpl.SensorData buildPartial() {
        io.confluent.cloud.demo.domain.SensorDataImpl.SensorData result = new io.confluent.cloud.demo.domain.SensorDataImpl.SensorData(this);
        result.deviceID_ = deviceID_;
        result.enabled_ = enabled_;
        result.reading_ = reading_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.confluent.cloud.demo.domain.SensorDataImpl.SensorData) {
          return mergeFrom((io.confluent.cloud.demo.domain.SensorDataImpl.SensorData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.confluent.cloud.demo.domain.SensorDataImpl.SensorData other) {
        if (other == io.confluent.cloud.demo.domain.SensorDataImpl.SensorData.getDefaultInstance()) return this;
        if (!other.getDeviceID().isEmpty()) {
          deviceID_ = other.deviceID_;
          onChanged();
        }
        if (other.getEnabled() != false) {
          setEnabled(other.getEnabled());
        }
        if (other.getReading() != 0D) {
          setReading(other.getReading());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.confluent.cloud.demo.domain.SensorDataImpl.SensorData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.confluent.cloud.demo.domain.SensorDataImpl.SensorData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object deviceID_ = "";
      /**
       * <code>string deviceID = 1;</code>
       * @return The deviceID.
       */
      public java.lang.String getDeviceID() {
        java.lang.Object ref = deviceID_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          deviceID_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string deviceID = 1;</code>
       * @return The bytes for deviceID.
       */
      public com.google.protobuf.ByteString
          getDeviceIDBytes() {
        java.lang.Object ref = deviceID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deviceID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string deviceID = 1;</code>
       * @param value The deviceID to set.
       * @return This builder for chaining.
       */
      public Builder setDeviceID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        deviceID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string deviceID = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeviceID() {
        
        deviceID_ = getDefaultInstance().getDeviceID();
        onChanged();
        return this;
      }
      /**
       * <code>string deviceID = 1;</code>
       * @param value The bytes for deviceID to set.
       * @return This builder for chaining.
       */
      public Builder setDeviceIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        deviceID_ = value;
        onChanged();
        return this;
      }

      private boolean enabled_ ;
      /**
       * <code>bool enabled = 2;</code>
       * @return The enabled.
       */
      public boolean getEnabled() {
        return enabled_;
      }
      /**
       * <code>bool enabled = 2;</code>
       * @param value The enabled to set.
       * @return This builder for chaining.
       */
      public Builder setEnabled(boolean value) {
        
        enabled_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool enabled = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnabled() {
        
        enabled_ = false;
        onChanged();
        return this;
      }

      private double reading_ ;
      /**
       * <code>double reading = 3;</code>
       * @return The reading.
       */
      public double getReading() {
        return reading_;
      }
      /**
       * <code>double reading = 3;</code>
       * @param value The reading to set.
       * @return This builder for chaining.
       */
      public Builder setReading(double value) {
        
        reading_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double reading = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearReading() {
        
        reading_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:io.confluent.cloud.demo.domain.SensorData)
    }

    // @@protoc_insertion_point(class_scope:io.confluent.cloud.demo.domain.SensorData)
    private static final io.confluent.cloud.demo.domain.SensorDataImpl.SensorData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.confluent.cloud.demo.domain.SensorDataImpl.SensorData();
    }

    public static io.confluent.cloud.demo.domain.SensorDataImpl.SensorData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SensorData>
        PARSER = new com.google.protobuf.AbstractParser<SensorData>() {
      @java.lang.Override
      public SensorData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SensorData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SensorData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SensorData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.confluent.cloud.demo.domain.SensorDataImpl.SensorData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_confluent_cloud_demo_domain_SensorData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_confluent_cloud_demo_domain_SensorData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020sensorData.proto\022\036io.confluent.cloud.d" +
      "emo.domain\"@\n\nSensorData\022\020\n\010deviceID\030\001 \001" +
      "(\t\022\017\n\007enabled\030\002 \001(\010\022\017\n\007reading\030\003 \001(\001B\020B\016" +
      "SensorDataImplb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_io_confluent_cloud_demo_domain_SensorData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_confluent_cloud_demo_domain_SensorData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_confluent_cloud_demo_domain_SensorData_descriptor,
        new java.lang.String[] { "DeviceID", "Enabled", "Reading", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}