package com.register.repository.server.infrastructure.exception;

import java.util.Map;

public abstract class RegisterRepositoryException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private Map<String, String> errorMasParameters;

    public Map<String, String> getErrorMasParameters() {
        return errorMasParameters;
    }

    public void setErrorMasParameters(Map<String, String> errorMasParameters) {
        this.errorMasParameters = errorMasParameters;
    }
    public RegisterRepositoryException() {
        super();
    }
    public RegisterRepositoryException(Throwable t) {
        super(t);
    }

    public RegisterRepositoryException(String s) {
        super(s);
    }

    public RegisterRepositoryException(String s, Map<String, String> errorMasParameters) {
        super(s);
        this.errorMasParameters = errorMasParameters;
    }
    public RegisterRepositoryException(String s, Throwable cause) {
        super(s, cause);
    }
}
