package com.master.storage;

public class StorageFileNotFoundException extends StorageException{
    StorageFileNotFoundException(String message)
    {
        super(message);
    }
    StorageFileNotFoundException(String message, Throwable throwable)
    {
        super(message, throwable);
    }
}
