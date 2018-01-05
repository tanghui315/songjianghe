// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: majong_rpc.proto

package mahjong.mode.proto;

public interface GangDataOrBuilder extends
        // @@protoc_insertion_point(interface_extends:majong_rpc.GangData)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.majong_rpc.GangType type = 1;</code>
     */
    int getTypeValue();

    /**
     * <code>.majong_rpc.GangType type = 1;</code>
     */
    mahjong.mode.proto.GangType getType();

    /**
     * <pre>
     * 放杠者的ID
     * </pre>
     * <p>
     * <code>int32 fighter = 2;</code>
     */
    int getFighter();

    /**
     * <pre>
     * 杠了哪张牌
     * </pre>
     * <p>
     * <code>int32 gangvalue = 3;</code>
     */
    int getGangvalue();
}
