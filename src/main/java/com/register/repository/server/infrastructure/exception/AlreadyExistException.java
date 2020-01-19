package com.register.repository.server.infrastructure.exception;

public class AlreadyExistException extends RegisterRepositoryException {

    public AlreadyExistException(String s) {
        super(s);
    }
}
