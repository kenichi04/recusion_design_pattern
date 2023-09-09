package com.example.prototype;

import com.example.prototype.stamps.*;

import java.util.HashMap;
import java.util.Map;

public class StampPrototypeFactory {
    // 静的メモリへの格納
    private static Map<Integer, Stamp> stampRegistry;
    private final static String DEFAULT_COLOR = "#e74c3c";

    // staticブロックで、クラスロード時に実行. 静的データの初期化など
    static {
        // レジストリのデータを初期化
        StampPrototypeFactory.stampRegistry = new HashMap<>();

        StampPrototypeFactory.stampRegistry.put(
                0, new GenericStamp(StampPrototypeFactory.DEFAULT_COLOR));
        StampPrototypeFactory.stampRegistry.put(
                1, new StarStamp(StampPrototypeFactory.DEFAULT_COLOR));
        StampPrototypeFactory.stampRegistry.put(
                2, new HeartStamp(StampPrototypeFactory.DEFAULT_COLOR));
        StampPrototypeFactory.stampRegistry.put(
                3, new PeaceStamp(StampPrototypeFactory.DEFAULT_COLOR));
    }

    public static void updatePrototype(Integer key, Stamp stamp) {
        StampPrototypeFactory.stampRegistry.put(key, stamp);
    }

    // レジスタ内のクローンを返す(オブジェクト自身への副作用を避けるため)
    public static Stamp get(Integer key) {
        Stamp p = StampPrototypeFactory.stampRegistry.get(key);
        if (p != null) return p.clone();
        return null;
    }
}
