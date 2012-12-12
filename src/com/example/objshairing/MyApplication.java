package com.example.objshairing;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public class MyApplication extends Application {
	private final String TAG = "MyApplication";
	
	private RecurssiveDemo recDemo;
	
	public void setRecurssiveDemo(RecurssiveDemo rDemo){
		recDemo = rDemo;
	}
	
	public RecurssiveDemo getRecurssiveDemo(){
		return recDemo;
	}
	
	public int getN(){
		return recDemo.getN();
	}
	
	public int factorial(){
		return recDemo.factorial();
	}
	
	public int triangle(){
		return recDemo.triangle();
	}

	@Override
	public Context getApplicationContext() {
		// TODO Auto-generated method stub
		Log.i(TAG, "MyApplication.getApplicationContext() called");
		return super.getApplicationContext();
	}

	@Override
	public Context getBaseContext() {
		// TODO Auto-generated method stub
		Log.i(TAG, "MyApplication.getBaseContext() called");
		return super.getBaseContext();
	}
	
	

}
