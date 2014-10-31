package com.example.plroff1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.WifiManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

public class MainActivity extends ActionBarActivity {

	private Button mBtnToggleWifi;
	private TextView mTvAppInfo;
	
	private boolean mWifiOn;
	
	private boolean mWifiFeatureAvaliable;
	private android.net.wifi.WifiManager mWifiManager;
	
	private Context mContext;
	
	private final String Tab_pl_Roff1="PLROFF1";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void init(){
    	mBtnToggleWifi=(Button)findViewById(R.id.id_btn_toggle_wifi);
    	mTvAppInfo= (TextView) findViewById(R.id.id_tv_app_info);
    	
    	mContext=MainActivity.this;
    	
    	mWifiManager=(android.net.wifi.WifiManager).getSystemService(WIFI_SERVICE);
    	mWifiOn=mWi
    	
    	/*try{
    	
    	mWifiFeatureAvaliable=mContext.getPackageManager().hasSystemFeature(PackageManager.FEATURE_WIFI);
    	}
    	catch(Exception e){
    		mWifiFeatureAvaliable=false;
    		android.utli.Log.e(TAG_PL_ROFF1, "Crash on getPackageManager,");
    	}
    	if (mWifiFeatureAvaliable!=null){
    		mWifiOn=mWifiManager.isWifiEnabled();
    		
    	}*/
    	}
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
