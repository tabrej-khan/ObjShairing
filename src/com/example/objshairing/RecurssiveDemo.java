package com.example.objshairing;

import android.util.Log;

public class RecurssiveDemo {
	private final String TAG = "RecurssiveDemo class";
	private int iN;
	
	public RecurssiveDemo(int n){
		iN = n;
	}
	
	public int getN(){
		return iN;
	}
	
	public void setN(int n){
		iN = n;
	}
	
	public int factorial(){
		Log.i(TAG, "factorial() called");
		return factorial(iN);
	}
	
	public int factorial(int n){
		Log.i(TAG, "factorial(n) called: n: "+n);
        if(n == 0)
            return 1;
        else
            return (n * factorial(n-1));
    }

	public int triangle(){
		return triangle(iN);
	}
	
	public int triangle(int n){
        if(n == 1)
            return 1;
        else
            return (n + triangle(n-1));
    }
}
