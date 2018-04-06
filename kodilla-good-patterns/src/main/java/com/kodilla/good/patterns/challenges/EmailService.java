package com.kodilla.good.patterns.challenges;

public class EmailService implements InformationService {
    public void sendMessage(User user) {
        System.out.println("Message send to " + user);
    }
}
