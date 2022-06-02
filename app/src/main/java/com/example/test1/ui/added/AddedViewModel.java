package com.example.test1.ui.added;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddedViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public AddedViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is added fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}