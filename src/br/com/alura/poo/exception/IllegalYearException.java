package br.com.alura.poo.exception;

public class IllegalYearException extends RuntimeException {
    private String message;

    public IllegalYearException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
