package org.jcapps.todolist;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class AddNewItem extends AppCompatActivity {
    private EditText mnewItemName;
    private EditText mnewItemDesc;
    private Intent mReturnItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_item);

        mReturnItem = new Intent(AddNewItem.this, ListItems.class);
        mnewItemName = (EditText)findViewById(R.id.edt_item_name);
        mnewItemDesc = (EditText) findViewById(R.id.edt_item_desc);

        // Grab the Name and Descrption of th item, combine it into 1 string and pass it back to ListItems activity.
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_additem);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("AddNewItem","click fab_additem");

                // Get value of edittext and store in Intent
                String itemname = mnewItemName.getText().toString();
                String itemdesc = mnewItemDesc.getText().toString();
                String itemstring = itemname + " - " + itemdesc;
                mReturnItem.putExtra("ITEM", itemstring);
                // Return to main activity
                startActivity(mReturnItem);

            }
        });


    }
}
