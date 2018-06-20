package com.moneyshop.gadeishvili.languagetest;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        LocaleHelper.setLocale(this,LocaleHelper.getLanguage(this));
    }
}
