package com.example.tp1_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Intent intent = getIntent();

        String depName = intent.getStringExtra("depName");
        String arrName = intent.getStringExtra("arrName");
        String msg_1 = getResources().getString(R.string.msg_1);
        String msg_2 = getResources().getString(R.string.msg_2);


        String msg = msg_1 + depName + msg_2 + arrName + " : ";

        TextView msgView = (TextView) findViewById(R.id.search_msg);
        msgView.setText(msg);
    }

    public void cancel(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}