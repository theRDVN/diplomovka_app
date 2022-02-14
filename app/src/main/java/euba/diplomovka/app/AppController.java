package euba.diplomovka.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping("/")
    public String getWelcomeMessage() {

        return "Hello Docker World!";
    }
}