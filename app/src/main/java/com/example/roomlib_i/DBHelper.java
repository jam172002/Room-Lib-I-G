package com.example.roomlib_i;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

//annotating the class with database
@Database(entities = Entity.class, exportSchema = false, version = 1)

//make this class abstract
public abstract class DBHelper  extends RoomDatabase {
    //create the final variable for database name so that it could not be changed
    public static final String BD_NAME = "MyDB";

    //create the instance of database so that it should be created only once and after it its instance will be referenced
    public static DBHelper instance;

    //create the abstract method for building instance of the database
    public static DBHelper getDB(Context context){

        //check that the instance is not created if not create it
        if(instance == null){
            instance = Room.databaseBuilder(context, DBHelper.class, BD_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

    public abstract DAO dao();
}
