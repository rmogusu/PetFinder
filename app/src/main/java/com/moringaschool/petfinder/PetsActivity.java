package com.moringaschool.petfinder;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PetsActivity extends AppCompatActivity {
    @BindView(R.id.locationTextView) TextView mLocationTextView;
    @BindView(R.id.listView) ListView mListView;
    private String[] pets = new String[] {"London", "Storm",
            "Atlas", "Artemus", "pampurr", "Scrodinger",
            "Powder", "Zelda", "sisto", "Andy and leah",
            "Abel", "Frazzle", "Sabrina",
            "cyborg", "Chip","Modecai","Elsa","Milo","Nova","Quarry","Jasmine","Bella",
            "Furry","Dunkin","Sync","Izzy","Tulsa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets);
        ButterKnife.bind(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, pets);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pet = ((TextView)view).getText().toString();
                Toast.makeText(PetsActivity.this, pet , Toast.LENGTH_LONG).show();
            }
        });
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the pets near: " + location);
    }
}
