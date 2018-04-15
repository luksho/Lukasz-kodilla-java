package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library");

        Book book1 = new Book("Last Night", "Tim Yellow", LocalDate.of(1989, 1, 1));
        Book book2 = new Book("Tony", "Martha Joffrey", LocalDate.of(1974, 1, 1));

        library.getBooks().add(book1);
        library.getBooks().add(book2);

        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep Cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(1, library.getBooks().size());
        Assert.assertEquals(1, clonedLibrary.getBooks().size());
        Assert.assertEquals(2, deepClonedLibrary.getBooks().size());
    }
}