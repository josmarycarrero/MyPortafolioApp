package com.example.josmary.josmarycarreronanodegree;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class DashActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);

        Button  streamer = (Button) findViewById(R.id.streamer);
        Button  scores = (Button) findViewById(R.id.scores);
        Button  library = (Button) findViewById(R.id.library);
        Button  builder = (Button) findViewById(R.id.builder);
        Button  reader = (Button) findViewById(R.id.reader);
        Button  own = (Button) findViewById(R.id.own);


        streamer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Spotify Streamer app !", Toast.LENGTH_LONG).show();

            }
        });

        scores.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Scores app !", Toast.LENGTH_LONG).show();

            }
        });

        library.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Library app !", Toast.LENGTH_LONG).show();

            }
        });

        builder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Builder app !", Toast.LENGTH_LONG).show();

            }
        });

        reader.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Reader app !", Toast.LENGTH_LONG).show();

            }
        });

        own.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Capstone app !", Toast.LENGTH_LONG).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
