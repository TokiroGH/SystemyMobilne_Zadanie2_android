package com.example.zadanie2_android;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ToDoItem> items;
    private ArrayAdapter<ToDoItem> itemsAdapter;
    private ListView listView;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.todolist);
        items = new ArrayList<ToDoItem>();
        itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(itemsAdapter);
        items.add(new ToDoItem("Task1", "Task 1 desc"));
        items.add(new ToDoItem("Task2", "Task 2 desc"));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Context context = getApplicationContext();
//                CharSequence text = "Hello toast!";
//                int duration = Toast.LENGTH_SHORT;
//
//                Toast toast = Toast.makeText(context, text, duration);
//                toast.show();

                Snackbar mySnackbar = Snackbar.make(findViewById(R.id.todolist),
                        "jakis tekst", Snackbar.LENGTH_SHORT);
                mySnackbar.show();

//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/LDU_Txk06tM?t=73"));
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                intent.setPackage("com.google.android.youtube");
//                startActivity(intent);
            }
        });
    }
}