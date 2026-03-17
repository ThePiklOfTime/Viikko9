package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class NoteViewHolder extends RecyclerView.ViewHolder {
    TextView noteIdText;
    TextView date;
    TextView title;
    TextView content;

    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);

        noteIdText = itemView.findViewById(R.id.NoteIdText);
        date = itemView.findViewById(R.id.NoteTimeAndDateText);
        title = itemView.findViewById(R.id.NoteTitleText);
        content = itemView.findViewById(R.id.NoteContentText);

    }
}
