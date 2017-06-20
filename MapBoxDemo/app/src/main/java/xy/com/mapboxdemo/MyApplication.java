package xy.com.mapboxdemo;

import android.app.Application;

import com.mapbox.mapboxsdk.Mapbox;

/**
 * PROJECT_NAME：MapBoxDemo
 * PACKAGE_NAME：xy.com.mapboxdemo
 * *************************************
 * 作者： alvin.G
 * 时间： 2017/6/11. 下午4:19
 * 邮箱：chinaguoxu@163.com
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Mapbox.getInstance(this, "pk.eyJ1IjoiZ3VveHUiLCJhIjoiY2ozc2U4bHFtMDA2czMycWM5YXA5anA3ZCJ9.tXWbXmUKJTrTcDFsh8MgAg");
    }
}
