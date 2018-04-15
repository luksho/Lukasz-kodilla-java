package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;

public final class Book {
    final private String title;
    final private String author;
    final private LocalDate publicationDate;

    public Book(final String title, final String author, final LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public Integer getPublicationYear() {
        Integer publicationYear = publicationDate.getYear();
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationDate=" + getPublicationYear() +
                '}';
    }
}