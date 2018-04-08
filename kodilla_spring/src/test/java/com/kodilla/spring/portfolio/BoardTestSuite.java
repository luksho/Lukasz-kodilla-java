package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.newTaskDoneList("Task1");
        board.newTaskInProgressList("Task1");
        board.newTaskToDoList("Task1");

        String doneList = board.getDoneList().getTask(0);
        String inProgressList = board.getInProgressList().getTask(0);
        String toDoList = board.getToDoList().getTask(0);

        //Then
        Assert.assertEquals("Task1", doneList);
        Assert.assertEquals("Task1", inProgressList);
        Assert.assertNotEquals("Task1", toDoList);


    }
}
