package app_superlol.alex.com.myapplication;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Jhin on 2017/6/1 0001.
 */

public class SuperLOLApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.setDebug(true);
        x.Ext.init(this);
    }
}
