package com.example.recyclerviewtext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recyclerview);
        int [] images = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j};
        String [] itemNames = {"Chicken Biriyani","Chicken Lolypop","Egg Fried Rice","Chicken 65","Mutton Curry","Mutton Biriyani","Fish Curry","Prawns Curry","Veg Noodles","Chicken Noodles",};
        String [] itemprice ={"200","250","100","350","400","350","250","250","100","150"};
        rv.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(this,images,itemNames,itemprice);
        rv.setAdapter(adapter);
    }

    public void submit(View view) {
    }
}