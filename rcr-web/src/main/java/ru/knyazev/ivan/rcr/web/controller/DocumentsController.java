package ru.knyazev.ivan.rcr.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class DocumentsController {

    @PostMapping("/push")
    public void addFile(@RequestParam("uploadFile") MultipartFile file) {

    }

    @PostMapping("/pop/{id}")
    public void stopPrintDoc(){

    }
}
