package pt.com.bmo.ws.api.photos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/photos")
public class PhotosController {

    @Autowired
    Environment environment;
    @GetMapping
    public String getPhotos() {
        return "Photos... runing on port: " + environment.getProperty("local.server.port");
    }
}
