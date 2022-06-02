package com.example.test1.ui.added;

import static com.example.test1.DataBase.AppDataBase.INSTANCE;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.test1.DAO.NoteDao;
import com.example.test1.DataBase.NoteRepository;
import com.example.test1.DataBase.NoteViewModel;
import com.example.test1.R;
import com.example.test1.model.Note;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewNoteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewNoteFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public Button btnsave;
    public EditText editTitle;
    public EditText editDescription;


    public NewNoteFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NewNoteFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NewNoteFragment newInstance(String param1, String param2) {
        NewNoteFragment fragment = new NewNoteFragment();
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
        View view= inflater.inflate(R.layout.fragment_new_note, container, false);
        Button btnsave= view.findViewById(R.id.button_save);
        EditText editTitle=view.findViewById(R.id.edit_title);
        EditText editDescription=view.findViewById(R.id.edit_description);


        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = null;
                String description = null;
                if (TextUtils.isEmpty(editTitle.getText()) || TextUtils.isEmpty(editDescription.getText())) {
                } else {
                    title = editTitle.getText().toString();
                    description = editDescription.getText().toString();
                }
                Note word = new Note( title, description);
                NoteRepository.getInstance(getActivity().getApplication()).insert(word);


            }
        });
        return view;
    }
}