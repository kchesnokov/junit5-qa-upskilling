package pl.luxoft.todolist.implementations;

import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.exceptions.CannotPassEmptyValueException;

public class TodoItemImpl extends TodoItem {

    private String title;

    private boolean completed;

    public TodoItemImpl(String title) {
        super();
        this.title = title;
        completed = false;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String newTitle) {
        if (newTitle.isEmpty())
            throw new CannotPassEmptyValueException("Title cannot be empty");
        this.title = newTitle;
    }

    @Override
    public void complete() {
        if (completed)
            this.completed = false;
        else
            this.completed = true;

//        this.completed = !completed;

    }

    public boolean isCompleted() {
        return completed;
    }
}
