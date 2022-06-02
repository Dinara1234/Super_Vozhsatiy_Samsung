package com.example.test1.DataBase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.test1.R;

public class NoteViewHolder extends RecyclerView.ViewHolder{
    private final TextView noteItemView;

    private NoteViewHolder(View itemView) {
        super(itemView);
        noteItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        noteItemView.setText(text);
    }

    static NoteViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new NoteViewHolder(view);
    }
}
