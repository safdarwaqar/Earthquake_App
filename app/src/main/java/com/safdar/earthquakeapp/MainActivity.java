package com.safdar.earthquakeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list);
        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Earthquake currentEarthquake = (Earthquake) parent.getItemAtPosition(position);

                // Convert the String URL into a URI object (to pass into the Intent constructor)
                Uri earthquakeUri = Uri.parse(currentEarthquake.getUrl());

                // Create a new intent to view the earthquake URI
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, earthquakeUri);

                // Send the intent to launch a new activity
                startActivity(websiteIntent);
            }

        });


//        for (int i = 0; i < 50; i++) {
//
//            earthquakes.add(new Earthquake("7.2", "Asansol", "Feb 23,2018"));
//            earthquakes.add(new Earthquake("5.2", "Kulti", "Feb 25,2018"));
//            earthquakes.add(new Earthquake("12.1", "America", "Feb 20,2018"));
//            earthquakes.add(new Earthquake("16.2", "Burdwan", "Feb 21,2018"));
//            earthquakes.add(new Earthquake("1.3", "Dhanbad", "Feb 29,2018"));
//            earthquakes.add(new Earthquake("1.3", "Delhi", "Feb 29,2018"));
//            earthquakes.add(new Earthquake("1.3", "Kolkata", "Feb 29,2018"));
//            earthquakes.add(new Earthquake("1.3", "Durgapur", "Feb 29,2018"));
//            earthquakes.add(new Earthquake("7.2", "San Francisco", "Feb 2, 2016"));
//            earthquakes.add(new Earthquake("6.1", "London", "July 20, 2015"));
//            earthquakes.add(new Earthquake("3.9", "Tokyo", "Nov 10, 2014"));
//            earthquakes.add(new Earthquake("5.4", "Mexico City", "May 3, 2014"));
//            earthquakes.add(new Earthquake("2.8", "Moscow", "Jan 31, 2013"));
//            earthquakes.add(new Earthquake("4.9", "Rio de Janeiro", "Aug 19, 2012"));
//            earthquakes.add(new Earthquake("1.6", "Paris", "Oct 30, 2011"));
//
//            EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);
//
//            listView.setAdapter(adapter);
//        }
    }
}