package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    private static final String helloPage = "hello";

    @GetMapping("/hello")
    public String index() {
        return helloPage;
    }

}