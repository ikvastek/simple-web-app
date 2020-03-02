package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InitialController {

    private static final String homePage = "home";

    @GetMapping("/home")
    public String getHomePage(){
        return homePage;
    }
}
