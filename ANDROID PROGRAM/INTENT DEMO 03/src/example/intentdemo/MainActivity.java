package example.intentdemo;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
	EditText uName,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	uName=(EditText)findViewById(R.id.edt_username);
    	pwd=(EditText)findViewById(R.id.edt_password);
    }
    public void callLogin(View v){
    	if((uName.getText().toString()).equalsIgnoreCase("SRMV")&&(pwd.getText().toString()).equalsIgnoreCase("123")){
    		
    		Intent i=new Intent(this,SecondActivity.class);
    		i.putExtra("UserName",uName.getText().toString());
    		startActivity(i);
    	}
    	
    	else{
    		Toast.makeText(getBaseContext(),"Either Username or Password Is Incorrect",Toast.LENGTH_SHORT).show();
   
    	}}

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
