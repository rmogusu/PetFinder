package com.moringaschool.petfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private EditText mLocationEditText;
    private Button mFindPetsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
        mFindPetsButton = (Button)findViewById(R.id.findPetsButton);
        mFindPetsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PetsActivity.class);
                startActivity(intent);
                String location = mLocationEditText.getText().toString();
                Toast.makeText(MainActivity.this, location, Toast.LENGTH_LONG).show();
            }
        });
    }
}
