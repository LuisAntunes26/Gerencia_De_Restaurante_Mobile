package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    public String[] categoryMenus;
    public int[] imagesMenu = {R.drawable.breakfast,R.drawable.launch,R.drawable.dinner,R.drawable.meat,R.drawable.fish,R.drawable.snacks,R.drawable.drink};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.categoryMenus = getResources().getStringArray(R.array.Category_Menu);
        this.recyclerView = findViewById(R.id.VerticalRecyclerViewHomeActivity);

        VerticalRecyclerViewAdaptor adaptor = new VerticalRecyclerViewAdaptor(this,categoryMenus,imagesMenu);
        recyclerView.setAdapter(adaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}