package com.reactlibrary;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ReactNativePlainToasterModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public ReactNativePlainToasterModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "ReactNativePlainToaster";
    }

    @ReactMethod
    public void showToastMessage(String message) {
        Toast.makeText(reactContext, message, Toast.LENGTH_LONG).show();
    }
}
