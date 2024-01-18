package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BookTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Book#Book(String, String)}
     *   <li>{@link Book#setAuthor(String)}
     *   <li>{@link Book#setTitle(String)}
     *   <li>{@link Book#toString()}
     *   <li>{@link Book#getAuthor()}
     *   <li>{@link Book#getTitle()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Book actualBook = new Book("Dr", "JaneDoe");
        actualBook.setAuthor("JaneDoe");
        actualBook.setTitle("Dr");
        String actualToStringResult = actualBook.toString();
        assertEquals("JaneDoe", actualBook.getAuthor());
        assertEquals("Dr", actualBook.getTitle());
        assertEquals("Book{title='Dr', author='JaneDoe'}", actualToStringResult);
    }
}

