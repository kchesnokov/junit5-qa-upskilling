package pl.luxoft.todolist.implementation.arraylist;


//import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.exceptions.CannotPassEmptyValueException;
import pl.luxoft.todolist.implementations.TodoItemImpl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

@Tag("all")
public class TodoItemTest extends BaseTodoItemTest{





    @Test
    public void todoItemNeedToHaveATitle(){
        Assertions.assertNotNull(todo.getTitle());
    }

    @Test
    public void todoItemTitleIsNotNullAfterCreation(){
        assertThat(todo.getTitle(), is(notNullValue()));


//        Assertions.assertNotNull(todo.getTitle());
    }

    @Test
  //  @Disabled
    public void todoItemTitleAsTheSameAsAssignedWhileCreating() {
        Assertions.assertEquals(todoTitle,todo.getTitle(),
                "Title is not the same as assigned while creating");
    }

    @Test
    public void todoItemTitleCanBeChanged() {
        String newTitle = "New todo item title";
        TodoItem todo = new TodoItemImpl("This is our first todo item");
        todo.setTitle(newTitle);
        Assertions.assertEquals(newTitle, todo.getTitle());
    }

    @Test
    @Order(4)
    public void todoItemCannotHaveEmptyTitle() {
        Assertions.assertThrows(CannotPassEmptyValueException.class,
                () -> todo.setTitle(""));
//                todo.setTitle(""));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/todos.csv")
    public void importTodoFromCsvFileTest(String todoItemName) {
        TodoItem todo = new TodoItemImpl(todoItemName);
        assertThat(todoItemName, equalToIgnoringCase(todo.getTitle()));
    }

    @Test
    public void todoItemCanBeMarkedCompleted() {
        todo.complete();
        Assertions.assertTrue(todo.isCompleted());
    }

    @Test
    public void todoItemIsNotCompletedAfterCreation(){
        Assertions.assertFalse(todo.isCompleted());
    }

    @Test
    public void todoItemMarkedNotCompletedAfterSecondToggling() {
        todo.complete();
        todo.complete();
        Assertions.assertFalse(todo.isCompleted());
    }
}
