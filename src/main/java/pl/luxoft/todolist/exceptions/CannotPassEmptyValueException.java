package pl.luxoft.todolist.exceptions;

public class CannotPassEmptyValueException extends RuntimeException{
    public CannotPassEmptyValueException(String message) {
        super(message);
    }
}
