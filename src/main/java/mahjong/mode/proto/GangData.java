// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: majong_rpc.proto

package mahjong.mode.proto;

/**
 * Protobuf type {@code majong_rpc.GangData}
 */
public final class GangData extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:majong_rpc.GangData)
        GangDataOrBuilder {
    // Use GangData.newBuilder() to construct.
    private GangData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private GangData() {
        type_ = 0;
        fighter_ = 0;
        gangvalue_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private GangData(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        int mutable_bitField0_ = 0;
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    default: {
                        if (!input.skipField(tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 8: {
                        int rawValue = input.readEnum();

                        type_ = rawValue;
                        break;
                    }
                    case 16: {

                        fighter_ = input.readInt32();
                        break;
                    }
                    case 24: {

                        gangvalue_ = input.readInt32();
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
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return mahjong.mode.proto.MajongRpcProto.internal_static_majong_rpc_GangData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return mahjong.mode.proto.MajongRpcProto.internal_static_majong_rpc_GangData_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        mahjong.mode.proto.GangData.class, mahjong.mode.proto.GangData.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    /**
     * <code>.majong_rpc.GangType type = 1;</code>
     */
    public int getTypeValue() {
        return type_;
    }

    /**
     * <code>.majong_rpc.GangType type = 1;</code>
     */
    public mahjong.mode.proto.GangType getType() {
        mahjong.mode.proto.GangType result = mahjong.mode.proto.GangType.valueOf(type_);
        return result == null ? mahjong.mode.proto.GangType.UNRECOGNIZED : result;
    }

    public static final int FIGHTER_FIELD_NUMBER = 2;
    private int fighter_;

    /**
     * <pre>
     * 放杠者的ID
     * </pre>
     * <p>
     * <code>int32 fighter = 2;</code>
     */
    public int getFighter() {
        return fighter_;
    }

    public static final int GANGVALUE_FIELD_NUMBER = 3;
    private int gangvalue_;

    /**
     * <pre>
     * 杠了哪张牌
     * </pre>
     * <p>
     * <code>int32 gangvalue = 3;</code>
     */
    public int getGangvalue() {
        return gangvalue_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (type_ != mahjong.mode.proto.GangType.BGANG.getNumber()) {
            output.writeEnum(1, type_);
        }
        if (fighter_ != 0) {
            output.writeInt32(2, fighter_);
        }
        if (gangvalue_ != 0) {
            output.writeInt32(3, gangvalue_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (type_ != mahjong.mode.proto.GangType.BGANG.getNumber()) {
            size += com.google.protobuf.CodedOutputStream
                    .computeEnumSize(1, type_);
        }
        if (fighter_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(2, fighter_);
        }
        if (gangvalue_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(3, gangvalue_);
        }
        memoizedSize = size;
        return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mahjong.mode.proto.GangData)) {
            return super.equals(obj);
        }
        mahjong.mode.proto.GangData other = (mahjong.mode.proto.GangData) obj;

        boolean result = true;
        result = result && type_ == other.type_;
        result = result && (getFighter()
                == other.getFighter());
        result = result && (getGangvalue()
                == other.getGangvalue());
        return result;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + type_;
        hash = (37 * hash) + FIGHTER_FIELD_NUMBER;
        hash = (53 * hash) + getFighter();
        hash = (37 * hash) + GANGVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getGangvalue();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static mahjong.mode.proto.GangData parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static mahjong.mode.proto.GangData parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static mahjong.mode.proto.GangData parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static mahjong.mode.proto.GangData parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static mahjong.mode.proto.GangData parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static mahjong.mode.proto.GangData parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static mahjong.mode.proto.GangData parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static mahjong.mode.proto.GangData parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static mahjong.mode.proto.GangData parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static mahjong.mode.proto.GangData parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static mahjong.mode.proto.GangData parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static mahjong.mode.proto.GangData parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(mahjong.mode.proto.GangData prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

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
     * Protobuf type {@code majong_rpc.GangData}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:majong_rpc.GangData)
            mahjong.mode.proto.GangDataOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return mahjong.mode.proto.MajongRpcProto.internal_static_majong_rpc_GangData_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return mahjong.mode.proto.MajongRpcProto.internal_static_majong_rpc_GangData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            mahjong.mode.proto.GangData.class, mahjong.mode.proto.GangData.Builder.class);
        }

        // Construct using mahjong.mode.proto.GangData.newBuilder()
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

        public Builder clear() {
            super.clear();
            type_ = 0;

            fighter_ = 0;

            gangvalue_ = 0;

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return mahjong.mode.proto.MajongRpcProto.internal_static_majong_rpc_GangData_descriptor;
        }

        public mahjong.mode.proto.GangData getDefaultInstanceForType() {
            return mahjong.mode.proto.GangData.getDefaultInstance();
        }

        public mahjong.mode.proto.GangData build() {
            mahjong.mode.proto.GangData result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public mahjong.mode.proto.GangData buildPartial() {
            mahjong.mode.proto.GangData result = new mahjong.mode.proto.GangData(this);
            result.type_ = type_;
            result.fighter_ = fighter_;
            result.gangvalue_ = gangvalue_;
            onBuilt();
            return result;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return (Builder) super.setField(field, value);
        }

        public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }

        public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }

        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof mahjong.mode.proto.GangData) {
                return mergeFrom((mahjong.mode.proto.GangData) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(mahjong.mode.proto.GangData other) {
            if (other == mahjong.mode.proto.GangData.getDefaultInstance()) return this;
            if (other.type_ != 0) {
                setTypeValue(other.getTypeValue());
            }
            if (other.getFighter() != 0) {
                setFighter(other.getFighter());
            }
            if (other.getGangvalue() != 0) {
                setGangvalue(other.getGangvalue());
            }
            onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            mahjong.mode.proto.GangData parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (mahjong.mode.proto.GangData) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int type_ = 0;

        /**
         * <code>.majong_rpc.GangType type = 1;</code>
         */
        public int getTypeValue() {
            return type_;
        }

        /**
         * <code>.majong_rpc.GangType type = 1;</code>
         */
        public Builder setTypeValue(int value) {
            type_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>.majong_rpc.GangType type = 1;</code>
         */
        public mahjong.mode.proto.GangType getType() {
            mahjong.mode.proto.GangType result = mahjong.mode.proto.GangType.valueOf(type_);
            return result == null ? mahjong.mode.proto.GangType.UNRECOGNIZED : result;
        }

        /**
         * <code>.majong_rpc.GangType type = 1;</code>
         */
        public Builder setType(mahjong.mode.proto.GangType value) {
            if (value == null) {
                throw new NullPointerException();
            }

            type_ = value.getNumber();
            onChanged();
            return this;
        }

        /**
         * <code>.majong_rpc.GangType type = 1;</code>
         */
        public Builder clearType() {

            type_ = 0;
            onChanged();
            return this;
        }

        private int fighter_;

        /**
         * <pre>
         * 放杠者的ID
         * </pre>
         * <p>
         * <code>int32 fighter = 2;</code>
         */
        public int getFighter() {
            return fighter_;
        }

        /**
         * <pre>
         * 放杠者的ID
         * </pre>
         * <p>
         * <code>int32 fighter = 2;</code>
         */
        public Builder setFighter(int value) {

            fighter_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 放杠者的ID
         * </pre>
         * <p>
         * <code>int32 fighter = 2;</code>
         */
        public Builder clearFighter() {

            fighter_ = 0;
            onChanged();
            return this;
        }

        private int gangvalue_;

        /**
         * <pre>
         * 杠了哪张牌
         * </pre>
         * <p>
         * <code>int32 gangvalue = 3;</code>
         */
        public int getGangvalue() {
            return gangvalue_;
        }

        /**
         * <pre>
         * 杠了哪张牌
         * </pre>
         * <p>
         * <code>int32 gangvalue = 3;</code>
         */
        public Builder setGangvalue(int value) {

            gangvalue_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 杠了哪张牌
         * </pre>
         * <p>
         * <code>int32 gangvalue = 3;</code>
         */
        public Builder clearGangvalue() {

            gangvalue_ = 0;
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }

        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }


        // @@protoc_insertion_point(builder_scope:majong_rpc.GangData)
    }

    // @@protoc_insertion_point(class_scope:majong_rpc.GangData)
    private static final mahjong.mode.proto.GangData DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new mahjong.mode.proto.GangData();
    }

    public static mahjong.mode.proto.GangData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GangData>
            PARSER = new com.google.protobuf.AbstractParser<GangData>() {
        public GangData parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new GangData(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<GangData> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GangData> getParserForType() {
        return PARSER;
    }

    public mahjong.mode.proto.GangData getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

