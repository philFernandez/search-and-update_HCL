package com.hcl.searchandupdate.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such User")
public class NoSuchUserException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NoSuchUserException(String msg, Throwable e) {
        super(msg, e);
    }

    public NoSuchUserException(String msg) {
        super(msg);
    }

    public NoSuchUserException() {
        super();
    }
}
