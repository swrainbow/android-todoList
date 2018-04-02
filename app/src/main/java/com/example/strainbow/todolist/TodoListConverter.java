package com.example.strainbow.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.strainbow.todolist.models.Todo;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by strainbow on 2018/3/21.
 */

public class TodoListConverter {

    private Context context;
    private List<Todo> data;

    public TodoListConverter(@NonNull Context context,List<Todo> data){
        this.context = context;
        this.data = data;
    }

    public View getView(int position){
        View view = LayoutInflater.from(context).inflate(R.layout.main_list_item,null);
        Todo todo = data.get(position);

        ((TextView) view.findViewById(R.id.main_list_item_text)).setText(todo.text);
        return view;
    }

}
