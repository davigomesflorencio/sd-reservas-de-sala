// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/MessageResponse.proto

package sd.ufc.reserva.model;

public final class ObjectMessageResponse {
  private ObjectMessageResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.MessageResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string mensagem = 1;</code>
     * @return The mensagem.
     */
    java.lang.String getMensagem();
    /**
     * <code>string mensagem = 1;</code>
     * @return The bytes for mensagem.
     */
    com.google.protobuf.ByteString
        getMensagemBytes();
  }
  /**
   * Protobuf type {@code proto.MessageResponse}
   */
  public  static final class MessageResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.MessageResponse)
      MessageResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MessageResponse.newBuilder() to construct.
    private MessageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MessageResponse() {
      mensagem_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MessageResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MessageResponse(
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

              mensagem_ = s;
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
      return sd.ufc.reserva.model.ObjectMessageResponse.internal_static_proto_MessageResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sd.ufc.reserva.model.ObjectMessageResponse.internal_static_proto_MessageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse.class, sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse.Builder.class);
    }

    public static final int MENSAGEM_FIELD_NUMBER = 1;
    private volatile java.lang.Object mensagem_;
    /**
     * <code>string mensagem = 1;</code>
     * @return The mensagem.
     */
    public java.lang.String getMensagem() {
      java.lang.Object ref = mensagem_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mensagem_ = s;
        return s;
      }
    }
    /**
     * <code>string mensagem = 1;</code>
     * @return The bytes for mensagem.
     */
    public com.google.protobuf.ByteString
        getMensagemBytes() {
      java.lang.Object ref = mensagem_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mensagem_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getMensagemBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mensagem_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getMensagemBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mensagem_);
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
      if (!(obj instanceof sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse)) {
        return super.equals(obj);
      }
      sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse other = (sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse) obj;

      if (!getMensagem()
          .equals(other.getMensagem())) return false;
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
      hash = (37 * hash) + MENSAGEM_FIELD_NUMBER;
      hash = (53 * hash) + getMensagem().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse parseFrom(
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
    public static Builder newBuilder(sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse prototype) {
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
     * Protobuf type {@code proto.MessageResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.MessageResponse)
        sd.ufc.reserva.model.ObjectMessageResponse.MessageResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sd.ufc.reserva.model.ObjectMessageResponse.internal_static_proto_MessageResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sd.ufc.reserva.model.ObjectMessageResponse.internal_static_proto_MessageResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse.class, sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse.Builder.class);
      }

      // Construct using sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse.newBuilder()
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
        mensagem_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sd.ufc.reserva.model.ObjectMessageResponse.internal_static_proto_MessageResponse_descriptor;
      }

      @java.lang.Override
      public sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse getDefaultInstanceForType() {
        return sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse.getDefaultInstance();
      }

      @java.lang.Override
      public sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse build() {
        sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse buildPartial() {
        sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse result = new sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse(this);
        result.mensagem_ = mensagem_;
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
        if (other instanceof sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse) {
          return mergeFrom((sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse other) {
        if (other == sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse.getDefaultInstance()) return this;
        if (!other.getMensagem().isEmpty()) {
          mensagem_ = other.mensagem_;
          onChanged();
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
        sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object mensagem_ = "";
      /**
       * <code>string mensagem = 1;</code>
       * @return The mensagem.
       */
      public java.lang.String getMensagem() {
        java.lang.Object ref = mensagem_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          mensagem_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string mensagem = 1;</code>
       * @return The bytes for mensagem.
       */
      public com.google.protobuf.ByteString
          getMensagemBytes() {
        java.lang.Object ref = mensagem_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mensagem_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string mensagem = 1;</code>
       * @param value The mensagem to set.
       * @return This builder for chaining.
       */
      public Builder setMensagem(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        mensagem_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string mensagem = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMensagem() {
        
        mensagem_ = getDefaultInstance().getMensagem();
        onChanged();
        return this;
      }
      /**
       * <code>string mensagem = 1;</code>
       * @param value The bytes for mensagem to set.
       * @return This builder for chaining.
       */
      public Builder setMensagemBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        mensagem_ = value;
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


      // @@protoc_insertion_point(builder_scope:proto.MessageResponse)
    }

    // @@protoc_insertion_point(class_scope:proto.MessageResponse)
    private static final sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse();
    }

    public static sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MessageResponse>
        PARSER = new com.google.protobuf.AbstractParser<MessageResponse>() {
      @java.lang.Override
      public MessageResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MessageResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MessageResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MessageResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public sd.ufc.reserva.model.ObjectMessageResponse.MessageResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_MessageResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_MessageResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033proto/MessageResponse.proto\022\005proto\"#\n\017" +
      "MessageResponse\022\020\n\010mensagem\030\001 \001(\tB-\n\024sd." +
      "ufc.reserva.modelB\025ObjectMessageResponse" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_MessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_MessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_MessageResponse_descriptor,
        new java.lang.String[] { "Mensagem", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}