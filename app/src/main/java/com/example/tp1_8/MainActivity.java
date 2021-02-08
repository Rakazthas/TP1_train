package com.example.tp1_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void search(View v){
        Intent intent = new Intent(this, SearchActivity.class);

        EditText cityDep = (EditText) findViewById(R.id.departure);
        EditText cityArr = (EditText) findViewById(R.id.arrival);

        String depName = cityDep.getText().toString();
        String arrName = cityArr.getText().toString();

        intent.putExtra("depName", depName);
        intent.putExtra("arrName", arrName);

        startActivity(intent);

    }
}