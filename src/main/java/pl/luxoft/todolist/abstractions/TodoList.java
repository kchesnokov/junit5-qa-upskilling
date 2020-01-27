package pl.luxoft.todolist.abstractions;

public abstract class TodoList {

    public abstract void add(TodoItem todo);
    public abstract int length();

    public abstract boolean delete(TodoItem todo);
}
