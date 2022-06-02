package com.example.test1.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.test1.model.Note;

import java.util.List;

@Dao
public interface NoteDao {
    @Query("SELECT * FROM Note")
    LiveData<List<Note>> getAll();

    @Query("SELECT * FROM Note WHERE id = :id")

    LiveData<Note> getById(long id);
    @Query("DELETE FROM Note")
    void deleteAll();

    @Insert
    void insert(Note Note);

    @Update
    void update(Note Note);

    @Delete
    void delete(Note Note);


}
