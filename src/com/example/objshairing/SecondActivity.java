package com.example.objshairing;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {
	private final String TAG = "SecondActivity Class";
	private TextView txtView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		txtView = (TextView) findViewById(R.id.textViewMsg);
		RecurssiveDemo recDemo2 = ((MyApplication)getApplication()).getRecurssiveDemo();
		
		Log.i(TAG, "onCreate() called: "+recDemo2);
		Log.i(TAG, "onCreate() N: "+recDemo2.getN());

		txtView.setText(String.valueOf(recDemo2.factorial()));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}

}