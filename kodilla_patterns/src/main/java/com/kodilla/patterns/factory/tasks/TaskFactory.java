package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Buy", "Pants", 1.0);
            case PAINTINGTASK:
                return new PaintingTask("Paint", "Red", "Wall");
            case DRIVINGTASK:
                return new DrivingTask("Driving", "Home", "Taxi");
            default:
                return null;
        }
    }
}
