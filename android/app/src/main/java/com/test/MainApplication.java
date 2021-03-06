package com.test;

import android.app.Application;
import android.util.Log;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import com.xebia.googlevrpanorama.RNGoogleVRPanoramaPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.mehcode.reactnative.splashscreen.SplashScreenPackage;
import com.magus.fblogin.FacebookLoginPackage;
import com.gantix.JailMonkey.JailMonkeyPackage;
import com.robinpowered.react.ScreenBrightness.ScreenBrightnessPackage;
import com.sensormanager.SensorManagerPackage;
import com.BV.LinearGradient.LinearGradientPackage;
import com.mapbox.reactnativemapboxgl.ReactNativeMapboxGLPackage;
import com.zmxv.RNSound.RNSoundPackage;
import com.lwansbrough.RCTCamera.*;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    protected boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          new RCTCameraPackage(),
          new RNSoundPackage(),
          new ReactNativeMapboxGLPackage(),
          new LinearGradientPackage(),
          new SensorManagerPackage(),
          new JailMonkeyPackage(),
          new FacebookLoginPackage(),
          new SplashScreenPackage(),
          new VectorIconsPackage(),
          new RNGoogleVRPanoramaPackage()
          //new ScreenBrightnessPackage(this)//still some issue here
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
      return mReactNativeHost;
  }
}