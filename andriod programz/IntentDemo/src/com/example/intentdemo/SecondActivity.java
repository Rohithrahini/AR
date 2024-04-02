package com.example.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
	
	TextView tvUname;
	Intent oldIntent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second); 
		tvUname = (TextView) findViewById(R.id.tv_Username);
		
		oldIntent = getIntent();
		tvUname.setText(oldIntent.getStringExtra("UserName"));
	}

}
 