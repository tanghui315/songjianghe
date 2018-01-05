// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SJ_mahjong.proto

package mahjong.mode.proto;

/**
 * Protobuf type {@code wh_majong.SjApplySettleData}
 */
public final class SjApplySettleData extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:wh_majong.SjApplySettleData)
        SjApplySettleDataOrBuilder {
    // Use SjApplySettleData.newBuilder() to construct.
    private SjApplySettleData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private SjApplySettleData() {
        xuanfeng_ = false;
        normal_ = false;
        top_ = 0;
        piao_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private SjApplySettleData(
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

                        xuanfeng_ = input.readBool();
                        break;
                    }
                    case 16: {

                        normal_ = input.readBool();
                        break;
                    }
                    case 24: {

                        top_ = input.readInt32();
                        break;
                    }
                    case 32: {

                        piao_ = input.readInt32();
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
        return mahjong.mode.proto.SJMahjong.internal_static_wh_majong_SjApplySettleData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return mahjong.mode.proto.SJMahjong.internal_static_wh_majong_SjApplySettleData_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        mahjong.mode.proto.SjApplySettleData.class, mahjong.mode.proto.SjApplySettleData.Builder.class);
    }

    public static final int XUANFENG_FIELD_NUMBER = 1;
    private boolean xuanfeng_;

    /**
     * <pre>
     * 是否旋风杠
     * </pre>
     * <p>
     * <code>bool xuanfeng = 1;</code>
     */
    public boolean getXuanfeng() {
        return xuanfeng_;
    }

    public static final int NORMAL_FIELD_NUMBER = 2;
    private boolean normal_;

    /**
     * <pre>
     * 是否是普通结算
     * </pre>
     * <p>
     * <code>bool normal = 2;</code>
     */
    public boolean getNormal() {
        return normal_;
    }

    public static final int TOP_FIELD_NUMBER = 3;
    private int top_;

    /**
     * <pre>
     * 番数：封顶的番数
     * </pre>
     * <p>
     * <code>int32 top = 3;</code>
     */
    public int getTop() {
        return top_;
    }

    public static final int PIAO_FIELD_NUMBER = 4;
    private int piao_;

    /**
     * <pre>
     * 飘的分数
     * </pre>
     * <p>
     * <code>int32 piao = 4;</code>
     */
    public int getPiao() {
        return piao_;
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
        if (xuanfeng_ != false) {
            output.writeBool(1, xuanfeng_);
        }
        if (normal_ != false) {
            output.writeBool(2, normal_);
        }
        if (top_ != 0) {
            output.writeInt32(3, top_);
        }
        if (piao_ != 0) {
            output.writeInt32(4, piao_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (xuanfeng_ != false) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBoolSize(1, xuanfeng_);
        }
        if (normal_ != false) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBoolSize(2, normal_);
        }
        if (top_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(3, top_);
        }
        if (piao_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(4, piao_);
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
        if (!(obj instanceof mahjong.mode.proto.SjApplySettleData)) {
            return super.equals(obj);
        }
        mahjong.mode.proto.SjApplySettleData other = (mahjong.mode.proto.SjApplySettleData) obj;

        boolean result = true;
        result = result && (getXuanfeng()
                == other.getXuanfeng());
        result = result && (getNormal()
                == other.getNormal());
        result = result && (getTop()
                == other.getTop());
        result = result && (getPiao()
                == other.getPiao());
        return result;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + XUANFENG_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                getXuanfeng());
        hash = (37 * hash) + NORMAL_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                getNormal());
        hash = (37 * hash) + TOP_FIELD_NUMBER;
        hash = (53 * hash) + getTop();
        hash = (37 * hash) + PIAO_FIELD_NUMBER;
        hash = (53 * hash) + getPiao();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static mahjong.mode.proto.SjApplySettleData parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static mahjong.mode.proto.SjApplySettleData parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static mahjong.mode.proto.SjApplySettleData parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static mahjong.mode.proto.SjApplySettleData parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static mahjong.mode.proto.SjApplySettleData parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static mahjong.mode.proto.SjApplySettleData parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static mahjong.mode.proto.SjApplySettleData parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static mahjong.mode.proto.SjApplySettleData parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static mahjong.mode.proto.SjApplySettleData parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static mahjong.mode.proto.SjApplySettleData parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static mahjong.mode.proto.SjApplySettleData parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static mahjong.mode.proto.SjApplySettleData parseFrom(
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

    public static Builder newBuilder(mahjong.mode.proto.SjApplySettleData prototype) {
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
     * Protobuf type {@code wh_majong.SjApplySettleData}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:wh_majong.SjApplySettleData)
            mahjong.mode.proto.SjApplySettleDataOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return mahjong.mode.proto.SJMahjong.internal_static_wh_majong_SjApplySettleData_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return mahjong.mode.proto.SJMahjong.internal_static_wh_majong_SjApplySettleData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            mahjong.mode.proto.SjApplySettleData.class, mahjong.mode.proto.SjApplySettleData.Builder.class);
        }

        // Construct using mahjong.mode.proto.SjApplySettleData.newBuilder()
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
            xuanfeng_ = false;

            normal_ = false;

            top_ = 0;

            piao_ = 0;

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return mahjong.mode.proto.SJMahjong.internal_static_wh_majong_SjApplySettleData_descriptor;
        }

        public mahjong.mode.proto.SjApplySettleData getDefaultInstanceForType() {
            return mahjong.mode.proto.SjApplySettleData.getDefaultInstance();
        }

        public mahjong.mode.proto.SjApplySettleData build() {
            mahjong.mode.proto.SjApplySettleData result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public mahjong.mode.proto.SjApplySettleData buildPartial() {
            mahjong.mode.proto.SjApplySettleData result = new mahjong.mode.proto.SjApplySettleData(this);
            result.xuanfeng_ = xuanfeng_;
            result.normal_ = normal_;
            result.top_ = top_;
            result.piao_ = piao_;
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
            if (other instanceof mahjong.mode.proto.SjApplySettleData) {
                return mergeFrom((mahjong.mode.proto.SjApplySettleData) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(mahjong.mode.proto.SjApplySettleData other) {
            if (other == mahjong.mode.proto.SjApplySettleData.getDefaultInstance()) return this;
            if (other.getXuanfeng() != false) {
                setXuanfeng(other.getXuanfeng());
            }
            if (other.getNormal() != false) {
                setNormal(other.getNormal());
            }
            if (other.getTop() != 0) {
                setTop(other.getTop());
            }
            if (other.getPiao() != 0) {
                setPiao(other.getPiao());
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
            mahjong.mode.proto.SjApplySettleData parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (mahjong.mode.proto.SjApplySettleData) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private boolean xuanfeng_;

        /**
         * <pre>
         * 是否旋风杠
         * </pre>
         * <p>
         * <code>bool xuanfeng = 1;</code>
         */
        public boolean getXuanfeng() {
            return xuanfeng_;
        }

        /**
         * <pre>
         * 是否旋风杠
         * </pre>
         * <p>
         * <code>bool xuanfeng = 1;</code>
         */
        public Builder setXuanfeng(boolean value) {

            xuanfeng_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 是否旋风杠
         * </pre>
         * <p>
         * <code>bool xuanfeng = 1;</code>
         */
        public Builder clearXuanfeng() {

            xuanfeng_ = false;
            onChanged();
            return this;
        }

        private boolean normal_;

        /**
         * <pre>
         * 是否是普通结算
         * </pre>
         * <p>
         * <code>bool normal = 2;</code>
         */
        public boolean getNormal() {
            return normal_;
        }

        /**
         * <pre>
         * 是否是普通结算
         * </pre>
         * <p>
         * <code>bool normal = 2;</code>
         */
        public Builder setNormal(boolean value) {

            normal_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 是否是普通结算
         * </pre>
         * <p>
         * <code>bool normal = 2;</code>
         */
        public Builder clearNormal() {

            normal_ = false;
            onChanged();
            return this;
        }

        private int top_;

        /**
         * <pre>
         * 番数：封顶的番数
         * </pre>
         * <p>
         * <code>int32 top = 3;</code>
         */
        public int getTop() {
            return top_;
        }

        /**
         * <pre>
         * 番数：封顶的番数
         * </pre>
         * <p>
         * <code>int32 top = 3;</code>
         */
        public Builder setTop(int value) {

            top_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 番数：封顶的番数
         * </pre>
         * <p>
         * <code>int32 top = 3;</code>
         */
        public Builder clearTop() {

            top_ = 0;
            onChanged();
            return this;
        }

        private int piao_;

        /**
         * <pre>
         * 飘的分数
         * </pre>
         * <p>
         * <code>int32 piao = 4;</code>
         */
        public int getPiao() {
            return piao_;
        }

        /**
         * <pre>
         * 飘的分数
         * </pre>
         * <p>
         * <code>int32 piao = 4;</code>
         */
        public Builder setPiao(int value) {

            piao_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 飘的分数
         * </pre>
         * <p>
         * <code>int32 piao = 4;</code>
         */
        public Builder clearPiao() {

            piao_ = 0;
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


        // @@protoc_insertion_point(builder_scope:wh_majong.SjApplySettleData)
    }

    // @@protoc_insertion_point(class_scope:wh_majong.SjApplySettleData)
    private static final mahjong.mode.proto.SjApplySettleData DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new mahjong.mode.proto.SjApplySettleData();
    }

    public static mahjong.mode.proto.SjApplySettleData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SjApplySettleData>
            PARSER = new com.google.protobuf.AbstractParser<SjApplySettleData>() {
        public SjApplySettleData parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new SjApplySettleData(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<SjApplySettleData> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SjApplySettleData> getParserForType() {
        return PARSER;
    }

    public mahjong.mode.proto.SjApplySettleData getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

