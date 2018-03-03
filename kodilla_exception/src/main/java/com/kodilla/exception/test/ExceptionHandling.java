package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.5, 2));
        } catch (Exception e){
            System.out.println("Problem with numbers");
        } finally {
            System.out.println("End");
        }
    }
}
