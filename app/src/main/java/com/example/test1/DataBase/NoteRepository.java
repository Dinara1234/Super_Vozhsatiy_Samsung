package com.example.test1.DataBase;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.test1.DAO.NoteDao;
import com.example.test1.model.Note;

import java.util.List;

public class NoteRepository {

    private static NoteRepository repository;

    private NoteRepository(Application application){
        AppDataBase db = AppDataBase.getDatabase(application);
        mNoteDao = db.noteDao();
        mAllNotes = mNoteDao.getAll();
    }

    public static NoteRepository getInstance(Application application){
        if (repository == null){
            repository = new NoteRepository(application);
        }
        return repository;
    }
    private  NoteDao mNoteDao;
    private LiveData<List<Note>> mAllNotes;

    // Note that in order to unit test the WordRepository, you have to remove the Application
    // dependency. This adds complexity and much more code, and this sample is not about testing.
    // See the BasicSample in the android-architecture-components repository at
    // https://github.com/googlesamples

    /*NoteRepository(Application application) {
        AppDataBase db = AppDataBase.getDatabase(application);
        mNoteDao = db.noteDao();
        mAllNotes = mNoteDao.getAll();
    }*/

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<List<Note>> getAllNotes() {
        return mAllNotes;
    }

    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    public  void insert(Note note) {
        AppDataBase.databaseWriteExecutor.execute(() -> {
            mNoteDao.insert(note);
        });
    }
}
