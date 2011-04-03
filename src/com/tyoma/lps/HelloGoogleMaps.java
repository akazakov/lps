package com.tyoma.lps;

import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


import com.google.android.maps.MapActivity;

public class HelloGoogleMaps extends MapActivity implements OnClickListener {


	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button button = (Button)findViewById(R.id.button1);
		if(button != null) {
	        button.setOnClickListener(this);   
		}
	}
	
	public void onClick(View v) {
		TextView tv = (TextView) findViewById(R.id.text);
		if(tv != null) {
			tv.setText("Hi Andy!");
		}
	}

}
