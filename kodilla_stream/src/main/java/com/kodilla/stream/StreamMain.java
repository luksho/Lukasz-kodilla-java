package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Text", String::toUpperCase);
        poemBeautifier.beautify("Text", String::toLowerCase);
        poemBeautifier.beautify("Text", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("Text", text -> text.replaceAll(text,"BBBB"));
    }
}

