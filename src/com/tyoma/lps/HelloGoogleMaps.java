package com.tyoma.lps;

import android.os.Bundle;

import com.google.android.maps.MapActivity;

public class HelloGoogleMaps extends MapActivity {

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);
	}

}
