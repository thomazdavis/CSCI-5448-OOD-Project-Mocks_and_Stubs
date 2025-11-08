package com.example.library.good;

public class LibraryService {
    private final DataStore store;

    public LibraryService(DataStore store) {
        this.store = store;
    }

    public void issueBook(String user, String book) {
        store.updateRecord(user, book);
    }
}