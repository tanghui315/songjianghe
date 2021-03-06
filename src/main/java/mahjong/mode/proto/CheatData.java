// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: majong_rpc.proto

package mahjong.mode.proto;

/**
 * <pre>
 * 作弊的数据
 * </pre>
 * <p>
 * Protobuf type {@code majong_rpc.CheatData}
 */
public final class CheatData extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:majong_rpc.CheatData)
        CheatDataOrBuilder {
    // Use CheatData.newBuilder() to construct.
    private CheatData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private CheatData() {
        playerId_ = 0;
        loc_ = 0;
        level_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private CheatData(
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

                        playerId_ = input.readInt32();
                        break;
                    }
                    case 16: {

                        loc_ = input.readInt32();
                        break;
                    }
                    case 24: {

                        level_ = input.readInt32();
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
        return mahjong.mode.proto.MajongRpcProto.internal_static_majong_rpc_CheatData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return mahjong.mode.proto.MajongRpcProto.internal_static_majong_rpc_CheatData_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        mahjong.mode.proto.CheatData.class, mahjong.mode.proto.CheatData.Builder.class);
    }

    public static final int PLAYER_ID_FIELD_NUMBER = 1;
    private int playerId_;

    /**
     * <code>int32 player_id = 1;</code>
     */
    public int getPlayerId() {
        return playerId_;
    }

    public static final int LOC_FIELD_NUMBER = 2;
    private int loc_;

    /**
     * <code>int32 loc = 2;</code>
     */
    public int getLoc() {
        return loc_;
    }

    public static final int LEVEL_FIELD_NUMBER = 3;
    private int level_;

    /**
     * <code>int32 level = 3;</code>
     */
    public int getLevel() {
        return level_;
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
        if (playerId_ != 0) {
            output.writeInt32(1, playerId_);
        }
        if (loc_ != 0) {
            output.writeInt32(2, loc_);
        }
        if (level_ != 0) {
            output.writeInt32(3, level_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (playerId_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(1, playerId_);
        }
        if (loc_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(2, loc_);
        }
        if (level_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(3, level_);
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
        if (!(obj instanceof mahjong.mode.proto.CheatData)) {
            return super.equals(obj);
        }
        mahjong.mode.proto.CheatData other = (mahjong.mode.proto.CheatData) obj;

        boolean result = true;
        result = result && (getPlayerId()
                == other.getPlayerId());
        result = result && (getLoc()
                == other.getLoc());
        result = result && (getLevel()
                == other.getLevel());
        return result;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + PLAYER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerId();
        hash = (37 * hash) + LOC_FIELD_NUMBER;
        hash = (53 * hash) + getLoc();
        hash = (37 * hash) + LEVEL_FIELD_NUMBER;
        hash = (53 * hash) + getLevel();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static mahjong.mode.proto.CheatData parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static mahjong.mode.proto.CheatData parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static mahjong.mode.proto.CheatData parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static mahjong.mode.proto.CheatData parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static mahjong.mode.proto.CheatData parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static mahjong.mode.proto.CheatData parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static mahjong.mode.proto.CheatData parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static mahjong.mode.proto.CheatData parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static mahjong.mode.proto.CheatData parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static mahjong.mode.proto.CheatData parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static mahjong.mode.proto.CheatData parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static mahjong.mode.proto.CheatData parseFrom(
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

    public static Builder newBuilder(mahjong.mode.proto.CheatData prototype) {
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
     * <pre>
     * 作弊的数据
     * </pre>
     * <p>
     * Protobuf type {@code majong_rpc.CheatData}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:majong_rpc.CheatData)
            mahjong.mode.proto.CheatDataOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return mahjong.mode.proto.MajongRpcProto.internal_static_majong_rpc_CheatData_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return mahjong.mode.proto.MajongRpcProto.internal_static_majong_rpc_CheatData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            mahjong.mode.proto.CheatData.class, mahjong.mode.proto.CheatData.Builder.class);
        }

        // Construct using mahjong.mode.proto.CheatData.newBuilder()
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
            playerId_ = 0;

            loc_ = 0;

            level_ = 0;

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return mahjong.mode.proto.MajongRpcProto.internal_static_majong_rpc_CheatData_descriptor;
        }

        public mahjong.mode.proto.CheatData getDefaultInstanceForType() {
            return mahjong.mode.proto.CheatData.getDefaultInstance();
        }

        public mahjong.mode.proto.CheatData build() {
            mahjong.mode.proto.CheatData result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public mahjong.mode.proto.CheatData buildPartial() {
            mahjong.mode.proto.CheatData result = new mahjong.mode.proto.CheatData(this);
            result.playerId_ = playerId_;
            result.loc_ = loc_;
            result.level_ = level_;
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
            if (other instanceof mahjong.mode.proto.CheatData) {
                return mergeFrom((mahjong.mode.proto.CheatData) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(mahjong.mode.proto.CheatData other) {
            if (other == mahjong.mode.proto.CheatData.getDefaultInstance()) return this;
            if (other.getPlayerId() != 0) {
                setPlayerId(other.getPlayerId());
            }
            if (other.getLoc() != 0) {
                setLoc(other.getLoc());
            }
            if (other.getLevel() != 0) {
                setLevel(other.getLevel());
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
            mahjong.mode.proto.CheatData parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (mahjong.mode.proto.CheatData) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int playerId_;

        /**
         * <code>int32 player_id = 1;</code>
         */
        public int getPlayerId() {
            return playerId_;
        }

        /**
         * <code>int32 player_id = 1;</code>
         */
        public Builder setPlayerId(int value) {

            playerId_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>int32 player_id = 1;</code>
         */
        public Builder clearPlayerId() {

            playerId_ = 0;
            onChanged();
            return this;
        }

        private int loc_;

        /**
         * <code>int32 loc = 2;</code>
         */
        public int getLoc() {
            return loc_;
        }

        /**
         * <code>int32 loc = 2;</code>
         */
        public Builder setLoc(int value) {

            loc_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>int32 loc = 2;</code>
         */
        public Builder clearLoc() {

            loc_ = 0;
            onChanged();
            return this;
        }

        private int level_;

        /**
         * <code>int32 level = 3;</code>
         */
        public int getLevel() {
            return level_;
        }

        /**
         * <code>int32 level = 3;</code>
         */
        public Builder setLevel(int value) {

            level_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>int32 level = 3;</code>
         */
        public Builder clearLevel() {

            level_ = 0;
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


        // @@protoc_insertion_point(builder_scope:majong_rpc.CheatData)
    }

    // @@protoc_insertion_point(class_scope:majong_rpc.CheatData)
    private static final mahjong.mode.proto.CheatData DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new mahjong.mode.proto.CheatData();
    }

    public static mahjong.mode.proto.CheatData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CheatData>
            PARSER = new com.google.protobuf.AbstractParser<CheatData>() {
        public CheatData parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new CheatData(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<CheatData> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CheatData> getParserForType() {
        return PARSER;
    }

    public mahjong.mode.proto.CheatData getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

