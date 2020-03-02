package hello.accessingdatamysql;

import hello.MainController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactsController {
    private final static String contactsMainPage = "contacts/contactsMain";

    @Autowired
    private MainController mainController;

    @GetMapping("/address_book")
    public String getHomePage(Model model){

        model.addAttribute("contactsList", mainController.getAllUsers());

        return contactsMainPage;
    }
}
