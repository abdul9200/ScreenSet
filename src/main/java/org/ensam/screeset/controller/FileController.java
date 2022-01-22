package org.ensam.screeset.controller;

import org.ensam.screeset.Entity.File;
import org.ensam.screeset.service.FileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/file")
public class FileController {
    private FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping(path = "/add")
    public File addFile(File file){
        return fileService.addFile(file);
    }
    @PutMapping(path = "/update/{id}")
    public File updateFile(File file){
        return fileService.updateFile(file);
    }
    @DeleteMapping(path = "/{id}")
    public void removeFile(File file){
         fileService.removeFile(file);
    }
    @GetMapping(path="/")
    public List<File> listFile(){
        return fileService.listFile();
    }


}
