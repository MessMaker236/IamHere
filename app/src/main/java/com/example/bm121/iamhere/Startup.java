package com.example.bm121.iamhere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Startup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
    }
    public void continueNow(View v){
    EditText editName = (EditText) findViewById(R.id.editName);
        String name = editName.getText().toString();
        Toast.makeText(getApplicationContext(),
                "Hello " + name,
                Toast.LENGTH_SHORT).show();
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MapsActivity.class);
        goToSecond.putExtra("name", name);
        startActivity(goToSecond);
    }
}
