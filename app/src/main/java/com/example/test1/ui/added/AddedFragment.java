package com.example.test1.ui.added;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test1.DataBase.NoteListAdapter;
import com.example.test1.DataBase.NoteViewModel;
import com.example.test1.R;
import com.example.test1.databinding.FragmentAddedBinding;
import com.example.test1.model.Note;
import com.example.test1.ui.NoteAdapter;

import java.util.ArrayList;

public class AddedFragment extends Fragment {

    private @NonNull FragmentAddedBinding binding;
    public NoteViewModel mNoteViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AddedViewModel addedViewModel =
                new ViewModelProvider(this).get(AddedViewModel.class);

        binding = FragmentAddedBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.fab.setOnClickListener(view -> {
            Navigation.findNavController(getView()).navigate(R.id.action_nav_added_to_newNoteFragment);
        });

        RecyclerView recyclerView = binding.recyclerview;
        final NoteListAdapter adapter = new NoteListAdapter(new NoteListAdapter.NoteDiff());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        mNoteViewModel = new ViewModelProvider(this).get(NoteViewModel.class);
        mNoteViewModel.getAllNotes().observe(getViewLifecycleOwner(), words -> {
            // Update the cached copy of the words in the adapter.
            adapter.submitList(words);
        });






        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}