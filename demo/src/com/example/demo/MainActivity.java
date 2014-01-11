package com.example.demo;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	private static final String TAG = "MainActivity";  
	  
    private Button btnOpen = null;  
    private Button btnClose = null;  
  
    @Override  
    public void onCreate(Bundle savedInstanceState)  
    {  
        super.onCreate(savedInstanceState);  
        Log.e(TAG, "--onCreate--");  
        setContentView(R.layout.activity_main);  
        btnOpen = (Button) findViewById(R.id.btnOpen);  
        btnClose = (Button) findViewById(R.id.btnClose);  
  
        btnOpen.setOnClickListener(new Button.OnClickListener()  
        {  
  
            @Override  
            public void onClick(View v)  
            {  
                Settings.System.putInt(getContentResolver(),  
                        Settings.System.ACCELEROMETER_ROTATION, 1);  
  
            }  
        });  
  
        btnClose.setOnClickListener(new Button.OnClickListener()  
        {  
  
            @Override  
            public void onClick(View v)  
            {  
                Settings.System.putInt(getContentResolver(),  
                        Settings.System.ACCELEROMETER_ROTATION, 0);  
            }  
        });  
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
