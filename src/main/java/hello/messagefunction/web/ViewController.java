package hello.messagefunction.web;

import hello.messagefunction.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @ModelAttribute("user")
    public User user() {
        return new User("spear", "Spring framework");
    }

    @RequestMapping()
    public String index() {
        return "web/index";
    }

    @RequestMapping("/main")
    public String main() {
        return "web/main";
    }

    @RequestMapping("/details")
    public String details() {
        return "web/details";
    }
}
