package pt.com.bmo.ws.api.contacts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contacts")
public class ContactsController {

    @Autowired
    Environment env;

    @GetMapping
    public String getContacts() {
        return "Contacts... on port" + env.getProperty("local.server.port");
    }

    //@PreAuthorize("hasAuthority('ROLE_dev') or #id == #jwt.subject")
//    public String deleteContact(@PathVariable long id, @AuthenticationPrincipal Jwt jwt) {
//        return "deleted contact of user id " + id + " and subject = " + jwt.getSubject();
//    }
}
