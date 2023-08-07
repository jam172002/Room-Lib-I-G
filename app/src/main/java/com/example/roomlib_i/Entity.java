package com.example.roomlib_i;


import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

@androidx.room.Entity(tableName = "MY_Table")

public class Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "Name")
    private String name;

    @ColumnInfo(name = "Author")
    private String author;

    @ColumnInfo(name = "Pages")
    private String pNumber;

}
