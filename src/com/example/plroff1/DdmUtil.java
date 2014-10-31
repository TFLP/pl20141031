package com.example.plroff1;

import android.content.Context;
import android.content.pm.PackageManager;

public class DdmUtil {

	private Context mContext;
	
	public DdmUtil(Context c){
		mContext=c;
		}
	public boolean doesTheDeviceFeatureWifi(){
		boolean ret;
		ret=mContext.getPackageManager().hasSystemFeature(PackageManager.FEATURE_WIFI);
		return ret;
		
	}
	
}
