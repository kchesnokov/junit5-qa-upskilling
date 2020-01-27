package pl.luxoft.todolist.implementation.arraylist;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.implementations.TodoItemImpl;

public class BaseTodoItemTest {

    public TodoItemImpl todo;
    public String todoTitle;


    @BeforeAll
    public static void setUpAll() {

    }

    @BeforeEach
    public void setUp() {
        todoTitle = "Get familiar with JUnit 5 user guide";
        todo = new TodoItemImpl(todoTitle);
    }

    @AfterEach
    public void tearDown() {

    }

    @AfterAll
    public static void tearDownAll() {

    }
}
