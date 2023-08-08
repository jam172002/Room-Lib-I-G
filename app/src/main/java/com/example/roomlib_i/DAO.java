package com.example.roomlib_i;

import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RoomDatabase;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DAO {

    //we need the return type here because the data we get here will be saved in data type
    @Query("select * from MY_Table")
    List<Entity> getAll();

    //this method need data to be inserted so we will pass the data to it
    //and I am passing it in form of my entity data type
    @Insert
    void insertData(Entity entity);

    @Update
    void updateData(Entity entity);

    @Delete
    void deleteData(Entity entity);


}
