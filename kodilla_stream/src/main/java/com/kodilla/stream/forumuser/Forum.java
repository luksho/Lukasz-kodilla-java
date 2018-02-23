package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    final private List<ForumUser> userList = new ArrayList<>();


    public Forum() {
        userList.add(new ForumUser(1147, "Jan", 'M', LocalDate.of(1975, 8, 11), 1));
        userList.add(new ForumUser(1547, "Adam", 'M', LocalDate.of(1999, 9, 14), 2));
        userList.add(new ForumUser(1435, "Anna", 'F', LocalDate.of(1965, 10, 2), 2));
        userList.add(new ForumUser(1577, "Tomasz", 'M', LocalDate.of(1981, 1, 28), 6));
        userList.add(new ForumUser(3254, "Natalia", 'F', LocalDate.of(1973, 12, 24), 5));
        userList.add(new ForumUser(9854, "Marcin", 'M', LocalDate.of(1959, 5, 23), 17));
        userList.add(new ForumUser(7485, "Kasia", 'F', LocalDate.of(1989, 5, 4), 1));
        userList.add(new ForumUser(2154, "Zosia", 'F', LocalDate.of(1974, 8, 14), 10));
        userList.add(new ForumUser(1247, "Jan", 'M', LocalDate.of(1999, 3, 19), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
