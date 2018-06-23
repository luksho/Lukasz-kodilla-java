package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(Task task) {
        System.out.println(mentorName + " you have new task from : " + task.getTaskName() + "\n" +
                " (total: " + task.getTasks().size() + " tasks)");
        updateCount++;
    }
}
