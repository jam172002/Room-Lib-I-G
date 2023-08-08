package com.example.roomlib_i;


import androidx.room.ColumnInfo;
import androidx.room.Ignore;
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

    //now the main constructor


    public Entity(int id, String name, String author, String pNumber) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pNumber = pNumber;
    }

    //this is not main constructor therefore it is annotated so IDE could see which is default constructor
    @Ignore
    public Entity(String name, String author, String pNumber) {
        this.name = name;
        this.author = author;
        this.pNumber = pNumber;
    }

    //the getter and setter work as same as constructor but still we need when one or few variables need to be get and set values

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }
}
