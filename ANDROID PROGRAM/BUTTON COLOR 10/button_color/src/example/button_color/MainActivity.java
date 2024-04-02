package example.button_color;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	Button b1,b2,b3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);

	}

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

	@Override
	public void onClick(View arg0) {
		if(arg0.getId()==R.id.button1)
		{
			Toast t= Toast.makeText(MainActivity.this, b1.getText()+"Clicked", Toast.LENGTH_LONG);
			t.setGravity(Gravity.CENTER, 20, 20);
			t.show();
		}
		if(arg0.getId()==R.id.button2)
		{
			Toast t = Toast.makeText(MainActivity.this, b2.getText()+"Clicked", Toast.LENGTH_LONG);
			t.setGravity(Gravity.CENTER, 20, 20);
			t.show();
		}
		if(arg0.getId()==R.id.button3)
		{
			Toast t = Toast.makeText(MainActivity.this, b3.getText()+"Clicked", Toast.LENGTH_LONG);
			t.setGravity(Gravity.CENTER, 20, 20);
			t.show();
		}
			
	}
}
