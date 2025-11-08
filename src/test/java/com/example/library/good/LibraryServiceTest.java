package com.example.library.good;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class LibraryServiceTest {

    @Test
    void testIssueBook_callsDataStore() {
        DataStore mockStore = mock(DataStore.class);
        LibraryService lib = new LibraryService(mockStore);

        lib.issueBook("Alice", "Clean Code");

        verify(mockStore).updateRecord("Alice", "Clean Code");
    }
}
