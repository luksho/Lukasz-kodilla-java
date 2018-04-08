package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Bean
    Board getBoard() {
        return new Board(createTaskList(), createTaskList(), createTaskList());
    }

    @Scope("prototype")
    @Bean
    public TaskList createTaskList() {
        return new TaskList();
    }
}
