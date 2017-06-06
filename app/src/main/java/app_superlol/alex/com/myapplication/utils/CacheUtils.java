package app_superlol.alex.com.myapplication.utils;

import android.content.Context;
import android.content.SharedPreferences;

import app_superlol.alex.com.myapplication.SplashActivity;
import app_superlol.alex.com.myapplication.activity.GuideActivity;

/**
 * Created by Jhin on 2017/5/27 0027.
 */

public class CacheUtils {


    public static boolean getBoolean(Context context, String key) {
        //得到缓存数据
        SharedPreferences sp = context.getSharedPreferences("superlol",Context.MODE_PRIVATE);
        return sp.getBoolean(key,false);

    }

    /**
     * 缓存布尔型参数
     * @param context
     * @param key
     * @param value
     */
    public static void putBoolean(Context context, String key, boolean value) {
        SharedPreferences sp = context.getSharedPreferences("superlol",Context.MODE_PRIVATE);
        sp.edit().putBoolean(key,value).commit();
    }

    public static void putString(Context context, String key, String value) {
        SharedPreferences sp = context.getSharedPreferences("superlol",Context.MODE_PRIVATE);
        sp.edit().putString(key,value).commit();

    }

    public static String getString(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences("superlol",Context.MODE_PRIVATE);
        return sp.getString(key,"");

    }
}
