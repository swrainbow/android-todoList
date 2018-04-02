package com.example.strainbow.todolist.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by strainbow on 2018/3/21.
 */

public class Todo implements Parcelable {
    public String text;
    public Date remindDate;


    public Todo(String text,Date remindDate){
        this.text = text;
        this.remindDate = remindDate;
    }
    protected Todo(Parcel in) {
        text = in.readString();
        remindDate = new Date(in.readLong());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(text);
        dest.writeLong(remindDate.getTime());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Todo> CREATOR = new Creator<Todo>() {
        @Override
        public Todo createFromParcel(Parcel in) {
            return new Todo(in);
        }

        @Override
        public Todo[] newArray(int size) {
            return new Todo[size];
        }
    };
}
