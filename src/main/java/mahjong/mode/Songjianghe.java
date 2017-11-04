// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: songjianghe.proto

package mahjong.mode;

public final class Songjianghe {
    private Songjianghe() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface SongjiangheMahjongIntoResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:SongjiangheMahjongIntoResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * 游戏局数
         * </pre>
         * <p>
         * <code>uint32 gameTimes = 1;</code>
         */
        int getGameTimes();

        /**
         * <pre>
         * true正常结算 false点炮包自己
         * </pre>
         * <p>
         * <code>bool normal = 2;</code>
         */
        boolean getNormal();

        /**
         * <pre>
         * true1翻封，false 16翻
         * </pre>
         * <p>
         * <code>bool singleFan = 3;</code>
         */
        boolean getSingleFan();

        /**
         * <pre>
         * 游戏规则  低位到高位到顺序（一炮多响，旋风杠，飘，允许相同ip，代开房）
         * </pre>
         * <p>
         * <code>uint32 gameRules = 4;</code>
         */
        int getGameRules();

        /**
         * <pre>
         * 人数
         * </pre>
         * <p>
         * <code>uint32 count = 5;</code>
         */
        int getCount();
    }

    /**
     * <pre>
     * 进入房间返回 ROOM_INFO
     * </pre>
     * <p>
     * Protobuf type {@code SongjiangheMahjongIntoResponse}
     */
    public static final class SongjiangheMahjongIntoResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:SongjiangheMahjongIntoResponse)
            SongjiangheMahjongIntoResponseOrBuilder {
        // Use SongjiangheMahjongIntoResponse.newBuilder() to construct.
        private SongjiangheMahjongIntoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private SongjiangheMahjongIntoResponse() {
            gameTimes_ = 0;
            normal_ = false;
            singleFan_ = false;
            gameRules_ = 0;
            count_ = 0;
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private SongjiangheMahjongIntoResponse(
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

                            gameTimes_ = input.readUInt32();
                            break;
                        }
                        case 16: {

                            normal_ = input.readBool();
                            break;
                        }
                        case 24: {

                            singleFan_ = input.readBool();
                            break;
                        }
                        case 32: {

                            gameRules_ = input.readUInt32();
                            break;
                        }
                        case 40: {

                            count_ = input.readUInt32();
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
            return mahjong.mode.Songjianghe.internal_static_SongjiangheMahjongIntoResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return mahjong.mode.Songjianghe.internal_static_SongjiangheMahjongIntoResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse.class, mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse.Builder.class);
        }

        public static final int GAMETIMES_FIELD_NUMBER = 1;
        private int gameTimes_;

        /**
         * <pre>
         * 游戏局数
         * </pre>
         * <p>
         * <code>uint32 gameTimes = 1;</code>
         */
        public int getGameTimes() {
            return gameTimes_;
        }

        public static final int NORMAL_FIELD_NUMBER = 2;
        private boolean normal_;

        /**
         * <pre>
         * true正常结算 false点炮包自己
         * </pre>
         * <p>
         * <code>bool normal = 2;</code>
         */
        public boolean getNormal() {
            return normal_;
        }

        public static final int SINGLEFAN_FIELD_NUMBER = 3;
        private boolean singleFan_;

        /**
         * <pre>
         * true1翻封，false 16翻
         * </pre>
         * <p>
         * <code>bool singleFan = 3;</code>
         */
        public boolean getSingleFan() {
            return singleFan_;
        }

        public static final int GAMERULES_FIELD_NUMBER = 4;
        private int gameRules_;

        /**
         * <pre>
         * 游戏规则  低位到高位到顺序（一炮多响，旋风杠，飘，允许相同ip，代开房）
         * </pre>
         * <p>
         * <code>uint32 gameRules = 4;</code>
         */
        public int getGameRules() {
            return gameRules_;
        }

        public static final int COUNT_FIELD_NUMBER = 5;
        private int count_;

        /**
         * <pre>
         * 人数
         * </pre>
         * <p>
         * <code>uint32 count = 5;</code>
         */
        public int getCount() {
            return count_;
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
            if (gameTimes_ != 0) {
                output.writeUInt32(1, gameTimes_);
            }
            if (normal_ != false) {
                output.writeBool(2, normal_);
            }
            if (singleFan_ != false) {
                output.writeBool(3, singleFan_);
            }
            if (gameRules_ != 0) {
                output.writeUInt32(4, gameRules_);
            }
            if (count_ != 0) {
                output.writeUInt32(5, count_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (gameTimes_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, gameTimes_);
            }
            if (normal_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(2, normal_);
            }
            if (singleFan_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(3, singleFan_);
            }
            if (gameRules_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(4, gameRules_);
            }
            if (count_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(5, count_);
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
            if (!(obj instanceof mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse)) {
                return super.equals(obj);
            }
            mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse other = (mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse) obj;

            boolean result = true;
            result = result && (getGameTimes()
                    == other.getGameTimes());
            result = result && (getNormal()
                    == other.getNormal());
            result = result && (getSingleFan()
                    == other.getSingleFan());
            result = result && (getGameRules()
                    == other.getGameRules());
            result = result && (getCount()
                    == other.getCount());
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + GAMETIMES_FIELD_NUMBER;
            hash = (53 * hash) + getGameTimes();
            hash = (37 * hash) + NORMAL_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getNormal());
            hash = (37 * hash) + SINGLEFAN_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getSingleFan());
            hash = (37 * hash) + GAMERULES_FIELD_NUMBER;
            hash = (53 * hash) + getGameRules();
            hash = (37 * hash) + COUNT_FIELD_NUMBER;
            hash = (53 * hash) + getCount();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse parseFrom(
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

        public static Builder newBuilder(mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse prototype) {
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
         * 进入房间返回 ROOM_INFO
         * </pre>
         * <p>
         * Protobuf type {@code SongjiangheMahjongIntoResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:SongjiangheMahjongIntoResponse)
                mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return mahjong.mode.Songjianghe.internal_static_SongjiangheMahjongIntoResponse_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return mahjong.mode.Songjianghe.internal_static_SongjiangheMahjongIntoResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse.class, mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse.Builder.class);
            }

            // Construct using mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse.newBuilder()
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
                gameTimes_ = 0;

                normal_ = false;

                singleFan_ = false;

                gameRules_ = 0;

                count_ = 0;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return mahjong.mode.Songjianghe.internal_static_SongjiangheMahjongIntoResponse_descriptor;
            }

            public mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse getDefaultInstanceForType() {
                return mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse.getDefaultInstance();
            }

            public mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse build() {
                mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse buildPartial() {
                mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse result = new mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse(this);
                result.gameTimes_ = gameTimes_;
                result.normal_ = normal_;
                result.singleFan_ = singleFan_;
                result.gameRules_ = gameRules_;
                result.count_ = count_;
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
                if (other instanceof mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse) {
                    return mergeFrom((mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse other) {
                if (other == mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse.getDefaultInstance()) return this;
                if (other.getGameTimes() != 0) {
                    setGameTimes(other.getGameTimes());
                }
                if (other.getNormal() != false) {
                    setNormal(other.getNormal());
                }
                if (other.getSingleFan() != false) {
                    setSingleFan(other.getSingleFan());
                }
                if (other.getGameRules() != 0) {
                    setGameRules(other.getGameRules());
                }
                if (other.getCount() != 0) {
                    setCount(other.getCount());
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
                mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int gameTimes_;

            /**
             * <pre>
             * 游戏局数
             * </pre>
             * <p>
             * <code>uint32 gameTimes = 1;</code>
             */
            public int getGameTimes() {
                return gameTimes_;
            }

            /**
             * <pre>
             * 游戏局数
             * </pre>
             * <p>
             * <code>uint32 gameTimes = 1;</code>
             */
            public Builder setGameTimes(int value) {

                gameTimes_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 游戏局数
             * </pre>
             * <p>
             * <code>uint32 gameTimes = 1;</code>
             */
            public Builder clearGameTimes() {

                gameTimes_ = 0;
                onChanged();
                return this;
            }

            private boolean normal_;

            /**
             * <pre>
             * true正常结算 false点炮包自己
             * </pre>
             * <p>
             * <code>bool normal = 2;</code>
             */
            public boolean getNormal() {
                return normal_;
            }

            /**
             * <pre>
             * true正常结算 false点炮包自己
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
             * true正常结算 false点炮包自己
             * </pre>
             * <p>
             * <code>bool normal = 2;</code>
             */
            public Builder clearNormal() {

                normal_ = false;
                onChanged();
                return this;
            }

            private boolean singleFan_;

            /**
             * <pre>
             * true1翻封，false 16翻
             * </pre>
             * <p>
             * <code>bool singleFan = 3;</code>
             */
            public boolean getSingleFan() {
                return singleFan_;
            }

            /**
             * <pre>
             * true1翻封，false 16翻
             * </pre>
             * <p>
             * <code>bool singleFan = 3;</code>
             */
            public Builder setSingleFan(boolean value) {

                singleFan_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * true1翻封，false 16翻
             * </pre>
             * <p>
             * <code>bool singleFan = 3;</code>
             */
            public Builder clearSingleFan() {

                singleFan_ = false;
                onChanged();
                return this;
            }

            private int gameRules_;

            /**
             * <pre>
             * 游戏规则  低位到高位到顺序（一炮多响，旋风杠，飘，允许相同ip，代开房）
             * </pre>
             * <p>
             * <code>uint32 gameRules = 4;</code>
             */
            public int getGameRules() {
                return gameRules_;
            }

            /**
             * <pre>
             * 游戏规则  低位到高位到顺序（一炮多响，旋风杠，飘，允许相同ip，代开房）
             * </pre>
             * <p>
             * <code>uint32 gameRules = 4;</code>
             */
            public Builder setGameRules(int value) {

                gameRules_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 游戏规则  低位到高位到顺序（一炮多响，旋风杠，飘，允许相同ip，代开房）
             * </pre>
             * <p>
             * <code>uint32 gameRules = 4;</code>
             */
            public Builder clearGameRules() {

                gameRules_ = 0;
                onChanged();
                return this;
            }

            private int count_;

            /**
             * <pre>
             * 人数
             * </pre>
             * <p>
             * <code>uint32 count = 5;</code>
             */
            public int getCount() {
                return count_;
            }

            /**
             * <pre>
             * 人数
             * </pre>
             * <p>
             * <code>uint32 count = 5;</code>
             */
            public Builder setCount(int value) {

                count_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 人数
             * </pre>
             * <p>
             * <code>uint32 count = 5;</code>
             */
            public Builder clearCount() {

                count_ = 0;
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


            // @@protoc_insertion_point(builder_scope:SongjiangheMahjongIntoResponse)
        }

        // @@protoc_insertion_point(class_scope:SongjiangheMahjongIntoResponse)
        private static final mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse();
        }

        public static mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<SongjiangheMahjongIntoResponse>
                PARSER = new com.google.protobuf.AbstractParser<SongjiangheMahjongIntoResponse>() {
            public SongjiangheMahjongIntoResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new SongjiangheMahjongIntoResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<SongjiangheMahjongIntoResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SongjiangheMahjongIntoResponse> getParserForType() {
      return PARSER;
    }

    public mahjong.mode.Songjianghe.SongjiangheMahjongIntoResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SongjiangheMahjongIntoResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SongjiangheMahjongIntoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021songjianghe.proto\"x\n\036SongjiangheMahjon" +
      "gIntoResponse\022\021\n\tgameTimes\030\001 \001(\r\022\016\n\006norm" +
      "al\030\002 \001(\010\022\021\n\tsingleFan\030\003 \001(\010\022\021\n\tgameRules" +
      "\030\004 \001(\r\022\r\n\005count\030\005 \001(\rB\016\n\014mahjong.modeb\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SongjiangheMahjongIntoResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SongjiangheMahjongIntoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SongjiangheMahjongIntoResponse_descriptor,
        new java.lang.String[] { "GameTimes", "Normal", "SingleFan", "GameRules", "Count", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
