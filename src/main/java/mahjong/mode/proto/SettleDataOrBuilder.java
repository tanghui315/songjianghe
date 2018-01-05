// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: majong_rpc.proto

package mahjong.mode.proto;

public interface SettleDataOrBuilder extends
        // @@protoc_insertion_point(interface_extends:majong_rpc.SettleData)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 alloc_id = 1;</code>
     */
    int getAllocId();

    /**
     * <pre>
     * 玩家数据
     * </pre>
     * <p>
     * <code>repeated .majong_rpc.SettlePlayerData player_list = 2;</code>
     */
    java.util.List<mahjong.mode.proto.SettlePlayerData>
    getPlayerListList();

    /**
     * <pre>
     * 玩家数据
     * </pre>
     * <p>
     * <code>repeated .majong_rpc.SettlePlayerData player_list = 2;</code>
     */
    mahjong.mode.proto.SettlePlayerData getPlayerList(int index);

    /**
     * <pre>
     * 玩家数据
     * </pre>
     * <p>
     * <code>repeated .majong_rpc.SettlePlayerData player_list = 2;</code>
     */
    int getPlayerListCount();

    /**
     * <pre>
     * 玩家数据
     * </pre>
     * <p>
     * <code>repeated .majong_rpc.SettlePlayerData player_list = 2;</code>
     */
    java.util.List<? extends mahjong.mode.proto.SettlePlayerDataOrBuilder>
    getPlayerListOrBuilderList();

    /**
     * <pre>
     * 玩家数据
     * </pre>
     * <p>
     * <code>repeated .majong_rpc.SettlePlayerData player_list = 2;</code>
     */
    mahjong.mode.proto.SettlePlayerDataOrBuilder getPlayerListOrBuilder(
            int index);

    /**
     * <pre>
     * 连续杠牌的次数
     * </pre>
     * <p>
     * <code>int32 gang_combo = 3;</code>
     */
    int getGangCombo();

    /**
     * <pre>
     * 本轮游戏的庄家ID
     * </pre>
     * <p>
     * <code>int32 banker = 4;</code>
     */
    int getBanker();

    /**
     * <pre>
     * 连续当庄家的次数（第一次当，值为1，第二次，值为2）
     * </pre>
     * <p>
     * <code>int32 banker_combo = 5;</code>
     */
    int getBankerCombo();

    /**
     * <pre>
     * 附加的一些判断条件
     * </pre>
     * <p>
     * <code>bytes adjunct = 6;</code>
     */
    com.google.protobuf.ByteString getAdjunct();
}