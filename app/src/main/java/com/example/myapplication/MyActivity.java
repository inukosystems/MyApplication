package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.logging.Handler;
import java.util.logging.LogRecord;


public class MyActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Button button1 = (Button)findViewById(R.id.button1);
        /*button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Thread.sleep(10000);
                }catch (InterruptedException e){
                    Log.v("HeavyTask", "error");
                }

                TextView textview1 = (TextView)findViewById(R.id.textView1);
                textview1.setText("Hello Thread");
                textview1.setVisibility(View.VISIBLE);
            }
        });*/
/*        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        heavyTask();
                    }
                }).start();

                TextView textview1 = (TextView)findViewById(R.id.textView1);
                textview1.setText("Hello Thread");
                textview1.setVisibility(View.VISIBLE);
            }
        });*/
        Handler handler = new Handler() {
            @Override
            public void close() {

            }

            @Override
            public void flush() {

            }

            @Override
            public void publish(LogRecord logRecord) {

            }
        };
    }

    private void heavyTask(){
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            Log.v("HeavyTask","error");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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
