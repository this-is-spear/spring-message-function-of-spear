package hello.messagefunction.web;

import hello.messagefunction.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @ModelAttribute
    public void changeLocale(HttpSession session) {
        String language = "en";
        session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, new Locale(language));
    }

}
