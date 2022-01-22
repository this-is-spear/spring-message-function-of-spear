package hello.messagefunction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Configuration
public class WebConfig{

    public LocaleResolver theLocaleResolver = new LocaleResolver() {
        @Override
        public Locale resolveLocale(HttpServletRequest request) {
            String lang = request.getParameter("lang");
            return new Locale(lang);
        }

        @Override
        public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

        }
    };

    @Bean
    public LocaleResolver localeResolver() {
        return theLocaleResolver;
    }

}
