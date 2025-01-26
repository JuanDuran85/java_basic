package sbt.contacts.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/add")
    public String addContactShow() {
        logger.info("------- Initializing add GET -------");
        return "add";
    }

    @PostMapping("/add")
    public String addContactForm(@ModelAttribute("contactForm") Contact contactToAdd) {
        logger.info("------- Initializing add POST -------");
        logger.info("{}", contactToAdd);
        contactService.saveOrUpdateContact(contactToAdd);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editContactShow(@PathVariable("id") int idContact, ModelMap model) {
        logger.info("------- Initializing edit GET -------");
        Contact contact = contactService.getContactById(idContact);
        model.put("contact", contact);
        return "edit";
    }

    @PostMapping("/edit")
    public String editContactForm(@ModelAttribute("contactForm") Contact contactToEdit) {
        logger.info("------- Initializing edit POST -------");
        logger.info("{}", contactToEdit);
        contactService.saveOrUpdateContact(contactToEdit);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteContactForm(@PathVariable("id") int idContact) {
        logger.info("------- Initializing delete POST -------");
        Contact contactToDelete = contactService.getContactById(idContact);
        contactService.deleteContact(contactToDelete);
        return "redirect:/";
    }
}
