package hva.miw.cohort17.hilgemanauctions.controller;

import hva.miw.cohort17.hilgemanauctions.model.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmailController {

    @Autowired
    private PersonService personService;

    @CrossOrigin
    @PostMapping("/emailcheck")
    public @ResponseBody
    boolean emailCheckHandler(@RequestParam String email){
        return personService.personExistByEmail(email);
    }
}
