package com.example.windowmanager;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/**
 * Created by khoado on 01,March,2020
 */

public class Utils {
    public static String LogTag = "khoado";
    public static String EXTRA_MSG = "extra_msg";


    public static boolean canDrawOverlays(Context context){
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            return true;
        }else{
            return Settings.canDrawOverlays(context);
        }
    }

}
