package hello.messagefunction.web;

import hello.messagefunction.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class ViewController {

    @ModelAttribute("user")
    public User user() {
        return new User("spear", "Spring framework");
    }

    @RequestMapping()
    public String index(@RequestParam(name = "lang") String lang) {
        return "web/index";
    }

    @RequestMapping("/main")
    public String main(@RequestParam(name = "lang") String lang) {
        return "web/main";
    }

    @RequestMapping("/details")
    public String details(@RequestParam(name = "lang") String lang) {
        return "web/details";
    }

}
