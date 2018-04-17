package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final private String taskName;
    final private String color;
    final private String whatToPaint;
    private boolean isEcecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println(taskName + " " + color + ": " + whatToPaint + " - EXECUTED");
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
