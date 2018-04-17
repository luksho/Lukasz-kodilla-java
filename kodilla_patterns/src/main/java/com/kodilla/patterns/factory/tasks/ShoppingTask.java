package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    final private String taskName;
    final private String whatToBy;
    final private double quantity;
    private boolean isEcecuted;

    public ShoppingTask(String taskName, String whatToBy, double quantity) {
        this.taskName = taskName;
        this.whatToBy = whatToBy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println(taskName + " " + whatToBy + ": " + quantity + " - EXECUTED");
        isEcecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (isEcecuted) {
            return true;
        } else {
            return false;
        }
    }
}
