package hva.miw.cohort17.hilgemanauctions.controller;
import hva.miw.cohort17.hilgemanauctions.model.User;
import hva.miw.cohort17.hilgemanauctions.model.service.LoginService;
import net.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("do_login")
    private String doLoginHandler(@RequestParam(name = "user_name") String email,
                                  @RequestParam(name = "user_password") String password,
                                  Model model){
        User user = loginService.retrieveUserFromDb(email);
        if(user != null && loginService.validatePassword(user, password)){
            model.addAttribute("user", user.getUserID());
            return "redirect:/personalpage";
        } else{
            model.addAttribute("login_error", "Gebruiker / wachtwoord combi niet geldig");
            return "Login";
        }
    }
}
