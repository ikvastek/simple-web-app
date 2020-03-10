package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactsController {
    private final static String contactsMainPage = "contactsMain";

    private final ContactsService contactsService;

    public ContactsController(ContactsService contactsService) {
        this.contactsService = contactsService;
    }

    @GetMapping("/address_book")
    public String getHomePage(Model model){

        model.addAttribute("contactsList", contactsService.getAllUsers());

        return contactsMainPage;
    }
}
