package pl.luxoft.todolist.implementation.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.abstractions.TodoList;
import pl.luxoft.todolist.implementations.TodoItemImpl;
import pl.luxoft.todolist.implementations.TodoListImpl;

import static org.hamcrest.MatcherAssert.assertThat;
import static pl.luxoft.todolist.matchers.IsEmptyTodoList.isAnEmptyTodoList;

public class TodoListTest extends BaseTodoListTest {

    TodoList todoList;
    TodoItem todo;

    @BeforeEach
    public void  setUp() {
//        String[] todos = new String[]
        todoList = new TodoListImpl();
        todo = new TodoItemImpl("Task 1");
    }

    @Test
    public void todoCanBeAddedToList() {
        todoList.add(todo);
        Assertions.assertEquals(1, todoList.length());
    }

    @Test
    public void todoCanBeDeletedFromList() {
        todoList.add(todo);
        todoList.delete(todo);
//        Assertions.assertTrue(todoList.delete(todo));
        assertThat(todoList, isAnEmptyTodoList());
    }


}
