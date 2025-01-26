package sbt.contacts.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import sbt.contacts.models.Contact;
import sbt.contacts.services.ContactServices;

import java.util.List;


@Controller
public class ContactController {

    private static final Logger logger = LoggerFactory.getLogger(ContactController.class);
    private final ContactServices contactService;

    public ContactController(ContactServices contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/")
    public String init(ModelMap model) {
        logger.info("------- Initializing contacts -------");
        List<Contact> contacts = contactService.listContacts();
        contacts.forEach(contactToShow -> logger.info(contactToShow.toString()));
        model.put("contacts", contacts);
        return "index";
    }

}
