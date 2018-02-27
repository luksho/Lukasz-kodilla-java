package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public OddNumbersExterminator() {
    }

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> OddNumbers = new ArrayList<Integer>();

        for (int n = 0; n < numbers.size(); n++) {
            if (numbers.get(n) % 2 > 0) {
                OddNumbers.add(numbers.get(n));
            }
        }
        return OddNumbers;
    }
}