package pt.com.bmo.ws.api.photos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/photos")
public class PhotosController {

    @GetMapping
    public String getPhotos() {
        return "Photos...";
    }
}
