package com.udemy.messageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<model> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListeDoldur();
        tanimla();
    }

    public void ListeDoldur() {
        list = new ArrayList<>();
        model m1 = new model("Ayşegül", "12345");
        model m2 = new model("Gamze", "67890");
        model m3 = new model("İlkay", "13579");
        model m4 = new model("İsmail", "24680");
        model m5 = new model("İbrahim", "12398");

        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
    }

    public void tanimla() {
        ListView listView = findViewById(R.id.mesajList);
        adapter adp = new adapter(list, this, this);
        listView.setAdapter(adp);
    }
}
