package com.example.gettoken;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String x="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        TextView textView=(TextView)findViewById( R.id.txtview );
         x=getDeviceId();
        textView.setText(  x);
        /*Parse.initialize(this, "YOUR API KEY", "YOUR APP KEY");
        PushService.subscribe(this, "CHANNELNAME", YOURCLASSNAME.class);
        PushService.setDefaultPushCallback(this, YOURCLASSNAME.class);
        ParseInstallation.getCurrentInstallation().saveInBackground();
        ParseAnalytics.trackAppOpened(getIntent());*/
      /*  try {
     InstanceID instanceID = InstanceID.getInstance(this);

     String token = instanceID.getToken(getString(R.string.gcm_defaultSenderId),
                    GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);

           // Log.i(TAG, "GCM Registration Token: " + token);

}catch (Exception e) {
            //Log.d(TAG, "Failed to complete token refresh", e);} */


  //    GCMRegistrar.register(this.context, CommonUtilities.SENDER_ID);
    }
    protected String getDeviceId() {
        return Settings.Secure.getString(this.getContentResolver(), Settings.Secure.ANDROID_ID);
    }
}
