package example.datepicker_control;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	DatePicker dp;
	Button b1;
	TextView t1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		dp=(DatePicker)findViewById(R.id.datePicker1);
		b1=(Button)findViewById(R.id.button1);	
		t1=(TextView)findViewById(R.id.textView1);
		b1.setOnClickListener(this);
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
	public void onClick(View v) {
		// TODO Auto-generated method stub
		t1.setText(getDate());
	}
	public String getDate()
	{
		StringBuffer data=new StringBuffer();
		data.append("Current Date: ");
		data.append((dp.getMonth()+1)+"/");
		data.append(dp.getDayOfMonth()+"/");
		data.append(dp.getYear());
		return data.toString();
		
	}
}
