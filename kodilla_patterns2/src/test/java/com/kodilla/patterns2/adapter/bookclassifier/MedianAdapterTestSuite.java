package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> booksFromLibraryA = new HashSet<>();
        Book ocean = new Book("Jan", "Ocean", 1992, "ISBN 254778545");
        Book sea = new Book("Kazimierz", "Sea", 1952, "ISBN 25471145");
        Book desert = new Book("Adam", "Desert", 2014, "ISBN 542145544");
        Book spain = new Book("Kamil", "Spain", 2002, "ISBN 854754541");
        Book traveling = new Book("Jakub", "Traveling", 2018, "ISBN 985474454");

        booksFromLibraryA.add(ocean);
        booksFromLibraryA.add(sea);
        booksFromLibraryA.add(desert);
        booksFromLibraryA.add(spain);
        booksFromLibraryA.add(traveling);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int result = medianAdapter.publicationYearMedian(booksFromLibraryA);
        System.out.println(result);
        //Then
        assertEquals(2002, result);
    }
}