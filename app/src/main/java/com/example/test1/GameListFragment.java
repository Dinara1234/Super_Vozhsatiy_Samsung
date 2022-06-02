package com.example.test1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.test1.DataBase.NoteListAdapter;
import com.example.test1.model.Note;
import com.example.test1.ui.NoteAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GameListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GameListFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Note> notes;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public GameListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GameListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GameListFragment newInstance(String param1, String param2) {
        GameListFragment fragment = new GameListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_added, container, false);
        recyclerView = view.findViewById(R.id.note_list);
//        notes = new ArrayList<>();
//        notes.add(new Note(1L,"Прятки","Игра прятки"));
//        notes.add(new Note(2L,"Прятки","Игра прятки"));
//        notes.add(new Note(3L,"Прятки","Игра прятки"));
//        notes.add(new Note(4L,"Прятки","Игра прятки"));
//        notes.add(new Note(5L,"Прятки","Игра прятки"));
//        notes.add(new Note(6L,"Прятки","Игра прятки"));
//        notes.add(new Note(7L,"Прятки","Игра прятки"));
//        notes.add(new Note(8L,"Прятки","Игра прятки"));
//        notes.add(new Note(9L,"Прятки","Игра прятки"));
//        notes.add(new Note(10L,"Прятки","Игра прятки"));
//        notes.add(new Note(11L,"Прятки","Игра прятки"));
//        notes.add(new Note(12L,"Прятки","Игра прятки"));
//        notes.add(new Note(13L,"Прятки","Игра прятки"));
//        notes.add(new Note(14L,"Прятки","Игра прятки"));
//        notes.add(new Note(15L,"Прятки","Игра прятки"));
//        notes.add(new Note(16L,"Прятки","Игра прятки"));
//        notes.add(new Note(17L,"Прятки","Игра прятки"));
//        notes.add(new Note(18L,"Прятки","Игра прятки"));
//        notes.add(new Note(19L,"Прятки","Игра прятки"));
//        notes.add(new Note(20L,"Прятки","Игра прятки"));
//        notes.add(new Note(21L,"Прятки","Игра прятки"));
//        notes.add(new Note(22L,"Прятки","Игра прятки"));
//        notes.add(new Note(23L,"Прятки","Игра прятки"));
//        notes.add(new Note(24L,"Прятки","Игра прятки"));
//        notes.add(new Note(25L,"Прятки","Игра прятки"));
        NoteAdapter adapter = new NoteAdapter(notes);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}