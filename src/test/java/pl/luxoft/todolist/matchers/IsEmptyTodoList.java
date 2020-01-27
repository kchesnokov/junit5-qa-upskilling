package pl.luxoft.todolist.matchers;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import pl.luxoft.todolist.abstractions.TodoList;

public class IsEmptyTodoList extends TypeSafeMatcher<TodoList> {
    @Override
    protected boolean matchesSafely(TodoList todoList) {
        return todoList.length() == 0;
    }

    @Factory
    public static Matcher<TodoList> isAnEmptyTodoList() {
        return new IsEmptyTodoList();
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("is an empty todo list");
    }
}
