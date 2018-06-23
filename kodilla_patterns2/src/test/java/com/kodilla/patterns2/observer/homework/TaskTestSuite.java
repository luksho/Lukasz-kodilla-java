package com.kodilla.patterns2.observer.homework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaskTestSuite {
    @Test
    public void taskUpdate() {
        //Given
        Task studentJohn = new StudentJohn();
        Task studentTim = new StudentJohn();
        Mentor jan = new Mentor("Jan");
        Mentor janusz = new Mentor("Janusz");

        studentJohn.registerObserver(jan);
        studentTim.registerObserver(janusz);

        //When
        studentJohn.addTask("Pattern observer");
        studentJohn.addTask("Pattern decorator");
        studentTim.addTask("Pattern singelton");
        studentTim.addTask("Pattern prototype");
        studentTim.addTask("Pattern strategy");

        //Then
        assertEquals(2, jan.getUpdateCount());
        assertEquals(3, janusz.getUpdateCount());
    }
}
