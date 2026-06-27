
package com.contactmanager.firstspring.controller;

import com.contactmanager.firstspring.entity.Contact;
import com.contactmanager.firstspring.Service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute(
                "contacts",
                service.getAllContacts()
        );

        return "index";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute(
                "contact",
                new Contact()
        );

        return "add-contact";
    }

    @PostMapping("/save")
    public String saveContact(
            @ModelAttribute Contact contact) {

        service.saveContact(contact);

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editContact(
            @PathVariable Long id,
            Model model) {

        model.addAttribute(
                "contact",
                service.getContactById(id)
        );

        return "edit-contact";
    }

    @GetMapping("/delete/{id}")
    public String deleteContact(
            @PathVariable Long id) {

        service.deleteContact(id);

        return "redirect:/";
    }
}
