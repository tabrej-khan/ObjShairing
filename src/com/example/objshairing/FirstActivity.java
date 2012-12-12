package com.example.objshairing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class FirstActivity extends Activity {
	private final String TAG = "FirstActivity class";

	private RecurssiveDemo recDemo1;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_first, menu);
		return true;
	}
	
	public void onClick(View v) {
		recDemo1 = new RecurssiveDemo(7);
		Log.i(TAG, "onClick() called recDemo1: "+recDemo1);
//		Log.i(TAG, "onClick() called getApplicationContext(): "+getApplicationContext());
//		MyApplication myApp = new MyApplication();
//		myApp.setRecurssiveDemo(recDemo1);
//		Log.i(TAG, "onClick() called myApp: "+myApp);
//		Log.i(TAG, "onClick() called myApp is equal to getAppContext? "+myApp.equals(getApplicationContext()));
		((MyApplication)getApplication()).setRecurssiveDemo(recDemo1);
		
		Intent intent = new Intent(this, SecondActivity.class);
		startActivity(intent);
		Log.i(TAG, "onClick() ends");
	}

}
