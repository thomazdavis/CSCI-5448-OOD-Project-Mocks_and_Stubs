package com.example.library.good;

public class DatabaseStore implements DataStore {
    @Override
    public void updateRecord(String user, String book) {
        System.out.println("Issued " + book + " to " + user);
    }
}
