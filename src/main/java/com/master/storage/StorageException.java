package com.master.storage;

public class StorageException extends RuntimeException {
    StorageException(String messages) {
        super(messages);
    }

    StorageException(String messages, Throwable throwable) {
        super(messages, throwable);
    }
}
