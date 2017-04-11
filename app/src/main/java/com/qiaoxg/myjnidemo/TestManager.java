package com.qiaoxg.myjnidemo;

import android.util.Log;

/**
 * Created by admin on 2017/3/23.
 */

public class TestManager {
    public static String TAG = "TestManager";

    static {
        try {
            System.loadLibrary("lstest");
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG, e.getMessage());
        }
        Log.d(TAG, "native_init");
        nativeInit();
    }

    public int add(int i, int j) {
        Log.d(TAG, "add");
        return nativeAdd(i, j);
    }

    private static native void nativeInit();

    private static native int nativeAdd(int i, int j);
}
