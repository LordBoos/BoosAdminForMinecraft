package cz.boosik.boosadminforminecraft.app;

import android.app.Application;
import android.content.Context;

/**
 * @author jakub.kolar@bsc-ideas.com
 */
public class App extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    /**
     * Gets the application context
     * @return The context
     */
    public static Context getContext(){
        return mContext;
    }
}
