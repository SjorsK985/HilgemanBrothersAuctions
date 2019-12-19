package hva.miw.cohort17.hilgemanauctions.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("login")
    public String loginHandler() {
        return "login";
    }

    @GetMapping("register")
    public String registerHandler(){
        return "register";
    }

    @GetMapping("index")
    public String indexHandler(){
        return "index";
    }
}