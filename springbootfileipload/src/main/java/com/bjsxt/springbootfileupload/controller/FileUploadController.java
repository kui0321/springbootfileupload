package com.bjsxt.springbootfileupload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;


@RestController
public class FileUploadController {
    @PostMapping("/fileUploadController")
    public String fileUpload(MultipartFile file) throws IOException {
        System.out.println("FileUploadController.fileUpload" + file.getOriginalFilename());
        file.transferTo(new File("d:/" + file.getOriginalFilename()));
        return "ok";
    }
}
