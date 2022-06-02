package com.example.test1.DataBase;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.test1.DataBase.NoteRepository;
import com.example.test1.model.Note;

import java.util.List;

public class NoteViewModel extends AndroidViewModel {

    private  NoteRepository mRepository;

    private final LiveData<List<Note>> mAllNotes;

    public NoteViewModel (Application application) {
        super(application);
        mRepository = NoteRepository.getInstance(getApplication());
        mAllNotes = mRepository.getAllNotes();
    }

    public LiveData<List<Note>> getAllNotes() { return mAllNotes; }

    public void insert(Note note) { mRepository.insert(note); }
}
