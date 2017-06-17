package android.sample.splashscreenbythreads;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;

public class SplashScreen extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Thread MainActivityCaller = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch (InterruptedException Error){
                    Error.printStackTrace();
                }
                finally {
                    Intent CallMainActivity = new Intent("android.intent.action.MAINACTIVITY");
                    startActivity(CallMainActivity);
                }
            }
        };
        MainActivityCaller.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
