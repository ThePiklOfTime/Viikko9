package com.example.myapplication;

import java.util.ArrayList;

public class NoteStorage {
    private static NoteStorage noteStorage = null;
    private ArrayList<Note> noteList;

    private NoteStorage(){

    }
    public static NoteStorage getInstance(){
        if (noteStorage == null) {
            noteStorage =  new NoteStorage();
        }
        return noteStorage;
    }
    public ArrayList<Note> getNotes(){
        return this.noteList;
    }
    public void addNote(Note note){
        noteList.add(note);
    }

}
