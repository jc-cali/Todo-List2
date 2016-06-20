package org.jcapps.todolist;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Intent mAddNewList;
    private Intent mListItems;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // When fab is pressed, go to AddNewList activity to add list name.
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Main", "click fab");
                mAddNewList = new Intent(getApplicationContext(), AddNewList.class);

                startActivity(mAddNewList);
            }
        });

        // Get the information from Intent after adding new list title from AddNewList Activity.
        mAddNewList = getIntent();
        // Move the value of the list name from the Intent into the TextView.
        TextView txtlisttitle = (TextView) findViewById(R.id.txt_list_name);
        txtlisttitle.setText(mAddNewList.getStringExtra("NAME"));

        // Go to ListItems activity to add items for the list.
        mListItems = new Intent(MainActivity.this, ListItems.class);
        View.OnClickListener itemlistener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Main","click txt_list_name");
                startActivity(mListItems);
            }
        };
        txtlisttitle.setOnClickListener(itemlistener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
