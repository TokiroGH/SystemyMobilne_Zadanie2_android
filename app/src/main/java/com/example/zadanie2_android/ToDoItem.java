package com.example.zadanie2_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ToDoItem {
    private String name;
    private String Description;

    public ToDoItem(String name, String description) {
        this.name = name;
        this.Description = description;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
