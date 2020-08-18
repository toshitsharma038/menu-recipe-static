package com.example.menurecipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView =findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager =new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList =new ArrayList<>();

        mFoodData =  new FoodData("Indian Food", "Indian cuisine consists of a variety of regional and traditional cuisines native to the Indian subcontinent. Given the diversity in soil, climate, culture, ethnic groups, and occupations, these cuisines vary substantially and use locally available spices, herbs, vegetables, and fruits.", "Rs 120", R.drawable.image);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Chole Bhature", "Indian cuisine consists of a variety of regional and traditional cuisines native to the Indian subcontinent. Given the diversity in soil, climate, culture, ethnic groups, and occupations, these cuisines vary substantially and use locally available spices, herbs, vegetables, and fruits.", "Rs 240", R.drawable.image1);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Vegetable Fruit & Non veg", "Fruitarianism and Jain vegetarianism permit only fruit, nuts, seeds, and other plant matter that can be gathered without harming the plant. Jain vegetarianism also includes dairy. ... Raw veganism includes only fresh and uncooked fruit, nuts, seeds, and vegetables.", "Rs 70", R.drawable.image2);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Burger", "A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun.", "Rs 189", R.drawable.image3);
        myFoodList.add(mFoodData);

        mFoodData =new FoodData("Burger with Coke", "A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun.", "Rs 90000", R.drawable.image4);
        myFoodList.add(mFoodData);


        MyAdapter myAdapter = new MyAdapter(MainActivity.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);
    }
}