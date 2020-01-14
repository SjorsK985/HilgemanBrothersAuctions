package hva.miw.cohort17.hilgemanauctions.controller;
import hva.miw.cohort17.hilgemanauctions.model.*;
import hva.miw.cohort17.hilgemanauctions.model.dao.PrivateUserDAO;
import hva.miw.cohort17.hilgemanauctions.model.service.CompanyUserService;
import hva.miw.cohort17.hilgemanauctions.model.service.PrivateUserService;
import hva.miw.cohort17.hilgemanauctions.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class RegisterController {

    @Autowired
    private PrivateUserService privateUserService;

    @Autowired
    private UserService userService;

    @Autowired
    private CompanyUserService companyUserService;

    @GetMapping("register")
    public String registerHandler(){
        return "register";
    }

    @PostMapping("do_register")
    public String doLoginHandler(@RequestParam(name = "accounttype_radio") String accountype, @RequestParam(name = "user_email") String emailadres, @RequestParam(name = "password") String wachtwoord,
                                 @RequestParam(name = "house_number") String huisnummer, @RequestParam(name = "postcode") String postcode,
                                 @RequestParam(name = "telephone") String telefoon, @RequestParam(name = "agree") boolean akkoord,
                                 @RequestParam(required = false, name = "gender") Gender gender, @RequestParam(required = false, name = "first_name") String voornaam,
                                 @RequestParam(required = false, name = "prepositions") String tussenvoegsel, @RequestParam(required = false, name ="last_name") String achternaam,
                                 @RequestParam(required = false, name = "dob") String geboortedatumString, @RequestParam(required = false, name = "bankaccount") String bankaccount,
                                 @RequestParam(required = false, name = "company_name") String bedrijfsnaam, @RequestParam(required = false, name = "segment") Sector sector,
                                 Model model){

        if(accountype.equals("particulier")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
            PrivateUser privateUser = new PrivateUser(emailadres, wachtwoord, new Address("onbekend", Integer.parseInt(huisnummer), postcode, "onbekend", "onbekend"),
                    new Bankaccount(bankaccount), gender, voornaam, tussenvoegsel, achternaam, LocalDate.parse(geboortedatumString, formatter));
            privateUserService.save(privateUser);
            model.addAttribute("user", userService.findUserByID(privateUser.getUserID()));
            return "personalpage";
        } else {
            CompanyUser companyUser = new CompanyUser(emailadres, wachtwoord, new Address("onbekend", Integer.parseInt(huisnummer), postcode, "onbekend", "onbekend"),
                    new Bankaccount(bankaccount), bedrijfsnaam, sector);
            companyUserService.save(companyUser);
            model.addAttribute("user", userService.findUserByID(companyUser.getUserID()));
            return "personalpage";
        }
    }
}
