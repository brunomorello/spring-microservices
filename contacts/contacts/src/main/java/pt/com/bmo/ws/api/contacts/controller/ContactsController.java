package pt.com.bmo.ws.api.contacts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contacts")
public class ContactsController {

    @GetMapping
    public String getContacts() {
        return "Contacts...";
    }
}
