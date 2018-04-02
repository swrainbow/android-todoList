package com.example.strainbow.todolist;

import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.strainbow.todolist.models.Todo;
import com.example.strainbow.todolist.utils.DateUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Fan Clicked",Toast.LENGTH_LONG).show();;

            }
        });

        setupUI(mockData());
    }

    private void setupUI(@NonNull List<Todo> todos){
        ListView listView = (ListView) findViewById(R.id.main_list_view);
        listView.setAdapter(new TodoListAdapter(this, todos));
    }


    private List<Todo> mockData(){
        List<Todo> list = new ArrayList<>();
        for(int i = 0; i < 100;++i){
            list.add(new Todo("todo "+i, DateUtils.stringToDate("2015 7 29 0:00")));
        }
        return list;
    }

}
