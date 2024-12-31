package com.master.fileuploadseviceimpl;

import com.master.fileuploadService.FileUploadService;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public class FileSystemStorageService implements FileUploadService {
    @Override
    public void init() {

    }

    @Override
    public void store(MultipartFile multipartFile) {

    }

    @Override
    public Stream<Path> loadAll() {
        return Stream.empty();
    }

    @Override
    public Path load(String fileName) {
        return null;
    }

    @Override
    public Resource loadAsResource(String fileName) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
