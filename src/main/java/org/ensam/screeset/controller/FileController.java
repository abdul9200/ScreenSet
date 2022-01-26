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
    public File addFile(@RequestBody File file){
        return fileService.addFile(file);
    }
    @PutMapping(path = "/update")
    public File updateFile(@RequestBody File file){
        return fileService.updateFile(file);
    }
    @DeleteMapping(path = "/remove/{id}")
    public void removeFile(@PathVariable(name="id")long id){
         fileService.removeFile(fileService.getFileById(id));
    }
    @GetMapping(path="/listFile")
    public List<File> listFile(){
        return fileService.listFile();
    }


}
