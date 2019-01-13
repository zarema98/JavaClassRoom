package com.company;

public class ChapterException extends Exception {
   private String message;
    public ChapterException(String description) {
        super(description);
        message = description;
    }

    @Override
    public String toString () {
        return message;
    }
}
