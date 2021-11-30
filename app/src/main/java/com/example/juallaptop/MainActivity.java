package com.example.juallaptop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvLaptop;
    Button btn_list, btn_grid, btn_detail;
    private ArrayList<laptop> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvLaptop = findViewById(R.id.rv_laptop);
        rvLaptop.setHasFixedSize(true);

        list.addAll(DataLaptop.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvLaptop.setLayoutManager(new LinearLayoutManager(this));
        ListLaptopAdapter listLaptopAdapter = new ListLaptopAdapter(list);
        rvLaptop.setAdapter(listLaptopAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                showRecyclerList();
                break;

            case R.id.action_grid:
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                showRecyclerCard();
                break;
        }
    }

    private void showRecyclerCard() {
        rvLaptop.setLayoutManager(new LinearLayoutManager(this));
        CardLaptopAdapter cardLaptopAdapter = new CardLaptopAdapter(list);
        rvLaptop.setAdapter(cardLaptopAdapter);
    }

    private void showRecyclerGrid(){
        rvLaptop.setLayoutManager(new GridLayoutManager(this, 2));
        GridLaptopAdapter gridLaptopAdapter = new GridLaptopAdapter(list);
        rvLaptop.setAdapter(gridLaptopAdapter);
    }
}