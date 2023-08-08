package com.example.roomlib_i;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import com.example.roomlib_i.databinding.ActivityAddBinding;

public class Add extends AppCompatActivity {

    ActivityAddBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityAddBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        bind.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = bind.tvName.getText().toString();
                String author = bind.tvAuthor.getText().toString();
                String number = bind.tvPages.getText().toString();

                //we first create entity instance where we will add our data
                Entity entity = new Entity(name, author, number);

                //now pass the entity to insert method declared in interface class
                DBHelper dbHelper = DBHelper.getDB(Add.this);

                dbHelper.dao().insertData(entity);

                //this intent will lead us back to the main activity when data is add
                startActivity(new Intent(Add.this, MainActivity.class));

            }
        });


    }
}