package com.example.intentdemo;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends Activity {
	
	EditText uName,pwd;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		uName = (EditText) findViewById(R.id.edt_UName);
		pwd = (EditText) findViewById(R.id.edt_Password);
	}
	
	public void callCheck(View v) {
		if((uName.getText().toString()).equalsIgnoreCase("Arun")&&(pwd.getText().toString()).equalsIgnoreCase("Arun"))
		{
			//call second Activity
			
		 	Intent i = new Intent(this,SecondActivity.class);
			i.putExtra("UserName",uName.getText().toString());
			startActivity(i);
		}
		else
		{
			Toast.makeText(getBaseContext(), "Either username or password is Incorrect", Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.first, menu);
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
