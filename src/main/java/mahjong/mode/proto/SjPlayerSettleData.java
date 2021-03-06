// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SJ_mahjong.proto

package mahjong.mode.proto;

/**
 * Protobuf type {@code wh_majong.SjPlayerSettleData}
 */
public final class SjPlayerSettleData extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:wh_majong.SjPlayerSettleData)
        SjPlayerSettleDataOrBuilder {
    // Use SjPlayerSettleData.newBuilder() to construct.
    private SjPlayerSettleData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private SjPlayerSettleData() {
        xflist_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private SjPlayerSettleData(
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
                        if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                            xflist_ = new java.util.ArrayList<java.lang.Integer>();
                            mutable_bitField0_ |= 0x00000001;
                        }
                        xflist_.add(input.readInt32());
                        break;
                    }
                    case 10: {
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                            xflist_ = new java.util.ArrayList<java.lang.Integer>();
                            mutable_bitField0_ |= 0x00000001;
                        }
                        while (input.getBytesUntilLimit() > 0) {
                            xflist_.add(input.readInt32());
                        }
                        input.popLimit(limit);
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
            if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                xflist_ = java.util.Collections.unmodifiableList(xflist_);
            }
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return mahjong.mode.proto.SJMahjong.internal_static_wh_majong_SjPlayerSettleData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return mahjong.mode.proto.SJMahjong.internal_static_wh_majong_SjPlayerSettleData_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        mahjong.mode.proto.SjPlayerSettleData.class, mahjong.mode.proto.SjPlayerSettleData.Builder.class);
    }

    public static final int XFLIST_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Integer> xflist_;

    /**
     * <pre>
     * 这里是包含了旋风杠本身的牌和补杠的牌
     * </pre>
     * <p>
     * <code>repeated int32 xflist = 1;</code>
     */
    public java.util.List<java.lang.Integer>
    getXflistList() {
        return xflist_;
    }

    /**
     * <pre>
     * 这里是包含了旋风杠本身的牌和补杠的牌
     * </pre>
     * <p>
     * <code>repeated int32 xflist = 1;</code>
     */
    public int getXflistCount() {
        return xflist_.size();
    }

    /**
     * <pre>
     * 这里是包含了旋风杠本身的牌和补杠的牌
     * </pre>
     * <p>
     * <code>repeated int32 xflist = 1;</code>
     */
    public int getXflist(int index) {
        return xflist_.get(index);
    }

    private int xflistMemoizedSerializedSize = -1;

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
        getSerializedSize();
        if (getXflistList().size() > 0) {
            output.writeUInt32NoTag(10);
            output.writeUInt32NoTag(xflistMemoizedSerializedSize);
        }
        for (int i = 0; i < xflist_.size(); i++) {
            output.writeInt32NoTag(xflist_.get(i));
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        {
            int dataSize = 0;
            for (int i = 0; i < xflist_.size(); i++) {
                dataSize += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(xflist_.get(i));
            }
            size += dataSize;
            if (!getXflistList().isEmpty()) {
                size += 1;
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(dataSize);
            }
            xflistMemoizedSerializedSize = dataSize;
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
        if (!(obj instanceof mahjong.mode.proto.SjPlayerSettleData)) {
            return super.equals(obj);
        }
        mahjong.mode.proto.SjPlayerSettleData other = (mahjong.mode.proto.SjPlayerSettleData) obj;

        boolean result = true;
        result = result && getXflistList()
                .equals(other.getXflistList());
        return result;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (getXflistCount() > 0) {
            hash = (37 * hash) + XFLIST_FIELD_NUMBER;
            hash = (53 * hash) + getXflistList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static mahjong.mode.proto.SjPlayerSettleData parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static mahjong.mode.proto.SjPlayerSettleData parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static mahjong.mode.proto.SjPlayerSettleData parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static mahjong.mode.proto.SjPlayerSettleData parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static mahjong.mode.proto.SjPlayerSettleData parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static mahjong.mode.proto.SjPlayerSettleData parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static mahjong.mode.proto.SjPlayerSettleData parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static mahjong.mode.proto.SjPlayerSettleData parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static mahjong.mode.proto.SjPlayerSettleData parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static mahjong.mode.proto.SjPlayerSettleData parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static mahjong.mode.proto.SjPlayerSettleData parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static mahjong.mode.proto.SjPlayerSettleData parseFrom(
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

    public static Builder newBuilder(mahjong.mode.proto.SjPlayerSettleData prototype) {
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
     * Protobuf type {@code wh_majong.SjPlayerSettleData}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:wh_majong.SjPlayerSettleData)
            mahjong.mode.proto.SjPlayerSettleDataOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return mahjong.mode.proto.SJMahjong.internal_static_wh_majong_SjPlayerSettleData_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return mahjong.mode.proto.SJMahjong.internal_static_wh_majong_SjPlayerSettleData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            mahjong.mode.proto.SjPlayerSettleData.class, mahjong.mode.proto.SjPlayerSettleData.Builder.class);
        }

        // Construct using mahjong.mode.proto.SjPlayerSettleData.newBuilder()
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
            xflist_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000001);
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return mahjong.mode.proto.SJMahjong.internal_static_wh_majong_SjPlayerSettleData_descriptor;
        }

        public mahjong.mode.proto.SjPlayerSettleData getDefaultInstanceForType() {
            return mahjong.mode.proto.SjPlayerSettleData.getDefaultInstance();
        }

        public mahjong.mode.proto.SjPlayerSettleData build() {
            mahjong.mode.proto.SjPlayerSettleData result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public mahjong.mode.proto.SjPlayerSettleData buildPartial() {
            mahjong.mode.proto.SjPlayerSettleData result = new mahjong.mode.proto.SjPlayerSettleData(this);
            int from_bitField0_ = bitField0_;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                xflist_ = java.util.Collections.unmodifiableList(xflist_);
                bitField0_ = (bitField0_ & ~0x00000001);
            }
            result.xflist_ = xflist_;
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
            if (other instanceof mahjong.mode.proto.SjPlayerSettleData) {
                return mergeFrom((mahjong.mode.proto.SjPlayerSettleData) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(mahjong.mode.proto.SjPlayerSettleData other) {
            if (other == mahjong.mode.proto.SjPlayerSettleData.getDefaultInstance()) return this;
            if (!other.xflist_.isEmpty()) {
                if (xflist_.isEmpty()) {
                    xflist_ = other.xflist_;
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    ensureXflistIsMutable();
                    xflist_.addAll(other.xflist_);
                }
                onChanged();
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
            mahjong.mode.proto.SjPlayerSettleData parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (mahjong.mode.proto.SjPlayerSettleData) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int bitField0_;

        private java.util.List<java.lang.Integer> xflist_ = java.util.Collections.emptyList();

        private void ensureXflistIsMutable() {
            if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                xflist_ = new java.util.ArrayList<java.lang.Integer>(xflist_);
                bitField0_ |= 0x00000001;
            }
        }

        /**
         * <pre>
         * 这里是包含了旋风杠本身的牌和补杠的牌
         * </pre>
         * <p>
         * <code>repeated int32 xflist = 1;</code>
         */
        public java.util.List<java.lang.Integer>
        getXflistList() {
            return java.util.Collections.unmodifiableList(xflist_);
        }

        /**
         * <pre>
         * 这里是包含了旋风杠本身的牌和补杠的牌
         * </pre>
         * <p>
         * <code>repeated int32 xflist = 1;</code>
         */
        public int getXflistCount() {
            return xflist_.size();
        }

        /**
         * <pre>
         * 这里是包含了旋风杠本身的牌和补杠的牌
         * </pre>
         * <p>
         * <code>repeated int32 xflist = 1;</code>
         */
        public int getXflist(int index) {
            return xflist_.get(index);
        }

        /**
         * <pre>
         * 这里是包含了旋风杠本身的牌和补杠的牌
         * </pre>
         * <p>
         * <code>repeated int32 xflist = 1;</code>
         */
        public Builder setXflist(
                int index, int value) {
            ensureXflistIsMutable();
            xflist_.set(index, value);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 这里是包含了旋风杠本身的牌和补杠的牌
         * </pre>
         * <p>
         * <code>repeated int32 xflist = 1;</code>
         */
        public Builder addXflist(int value) {
            ensureXflistIsMutable();
            xflist_.add(value);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 这里是包含了旋风杠本身的牌和补杠的牌
         * </pre>
         * <p>
         * <code>repeated int32 xflist = 1;</code>
         */
        public Builder addAllXflist(
                java.lang.Iterable<? extends java.lang.Integer> values) {
            ensureXflistIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, xflist_);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 这里是包含了旋风杠本身的牌和补杠的牌
         * </pre>
         * <p>
         * <code>repeated int32 xflist = 1;</code>
         */
        public Builder clearXflist() {
            xflist_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000001);
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


        // @@protoc_insertion_point(builder_scope:wh_majong.SjPlayerSettleData)
    }

    // @@protoc_insertion_point(class_scope:wh_majong.SjPlayerSettleData)
    private static final mahjong.mode.proto.SjPlayerSettleData DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new mahjong.mode.proto.SjPlayerSettleData();
    }

    public static mahjong.mode.proto.SjPlayerSettleData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SjPlayerSettleData>
            PARSER = new com.google.protobuf.AbstractParser<SjPlayerSettleData>() {
        public SjPlayerSettleData parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new SjPlayerSettleData(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<SjPlayerSettleData> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SjPlayerSettleData> getParserForType() {
        return PARSER;
    }

    public mahjong.mode.proto.SjPlayerSettleData getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

