package com.example.optionsmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // Initiating Menu XML file (menu_main.xml)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }
    /**
     *Event handling for individual menu item selected
     *identify single menu item by its ID
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.Item1:
                Toast.makeText(getApplicationContext(), "Item1 Selected ", Toast.LENGTH_LONG).show();
                return true;
            case R.id.Item2:
                Toast.makeText(getApplicationContext(), "Item2 Selected ", Toast.LENGTH_LONG).show();
                return true;
            case R.id.Item3:
                Toast.makeText(getApplicationContext(), "Item3 Selected ", Toast.LENGTH_LONG).show();
                return true;
            case R.id.Item4:
                Toast.makeText(getApplicationContext(), "Item4 Selected ", Toast.LENGTH_LONG).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}