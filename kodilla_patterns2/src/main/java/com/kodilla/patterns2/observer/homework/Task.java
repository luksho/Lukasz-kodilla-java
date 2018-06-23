package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Task implements Observable {
    private final String taskName;
    private final List<Observer> mentors;
    private final ArrayDeque<String> tasks;

    public Task(String taskName) {
        mentors = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.taskName = taskName;
    }

    public void addTask(String task) {
        tasks.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        mentors.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        mentors.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer mentor : mentors) {
            mentor.update(this);
        }
    }

    public String getTaskName() {
        return taskName;
    }

    public List<Observer> getMentors() {
        return mentors;
    }

    public ArrayDeque<String> getTasks() {
        return tasks;
    }
}
