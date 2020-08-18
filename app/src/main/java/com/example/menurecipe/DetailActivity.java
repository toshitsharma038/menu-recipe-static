package com.example.menurecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView foodDescrition;
    ImageView foodImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        foodDescrition =findViewById(R.id.txtDescription);
        foodImage =findViewById(R.id.ivImage2);

        Bundle mBundle =getIntent().getExtras();

        if(mBundle!=null)
        {
            foodDescrition.setText(mBundle.getString("Description"));
            foodImage.setImageResource(mBundle.getInt("Image"));

        }

    }
}