package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {


       /* PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Text", String::toUpperCase);
        poemBeautifier.beautify("Text", String::toLowerCase);
        poemBeautifier.beautify("Text", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("Text", text -> text.replaceAll(text, "BBBB"));
    }

    */

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }

}