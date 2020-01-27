package pl.luxoft.todolist.abstractions;

import pl.luxoft.todolist.interfaces.Obtainable;
import pl.luxoft.todolist.interfaces.Togglable;

public abstract class TodoItem {

    public abstract String getTitle();

    public abstract void setTitle(String newTitle);

    public abstract void complete();

    public abstract boolean isCompleted();
}
