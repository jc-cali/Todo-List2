package org.jcapps.todolist;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AddNewList extends AppCompatActivity {
    private EditText mnewListTitles;
    private Intent mReturnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_list);

        mReturnMain = new Intent(AddNewList.this, MainActivity.class);
        mnewListTitles = (EditText)findViewById(R.id.edt_addlist);

        // Return the list name from the editText field back to the Main Activity.
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_addlist);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("AddNewList","click fab_addlist");

                // Get value of edittext and store in Intent
                String titlename = mnewListTitles.getText().toString();
                mReturnMain.putExtra("NAME", titlename);
                // Return to main activity
                startActivity(mReturnMain);
            }
        });

    }
}
