package pl.luxoft.todolist.implementations;

import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.abstractions.TodoList;

import java.util.ArrayList;
import java.util.List;

public class TodoListImpl extends TodoList {

    private List<TodoItem> todos;

    public TodoListImpl(List<TodoItem> todos) {
        this.todos = todos;
    }

    public TodoListImpl() {
        this.todos = new ArrayList<>();
    }

    @Override
    public void add(TodoItem todo) {
        todos.add(todo);
    }

    @Override
    public int length() {
        return todos.size();
    }

    @Override
    public boolean delete(TodoItem todo) {
//        if(!todos.isEmpty()) todos.remove(todo);
        return todos.remove(todo);
    }
}
