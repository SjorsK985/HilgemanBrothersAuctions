package hva.miw.cohort17.hilgemanauctions.controller;

import hva.miw.cohort17.hilgemanauctions.model.User;
import hva.miw.cohort17.hilgemanauctions.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class NewLotController {

    @Autowired
    UserService userService;

    @GetMapping("newlot")
    private String newLotHandler(@SessionAttribute("user") User user, Model model){
        return "newlot";
    }

    @PostMapping("add_newlot")
    private String addNewLotHandler(@RequestParam (name = "lot-category") String lotCategory,
                                    @RequestParam (name = "lot-brand") String brand,
                                    @RequestParam (name = "lot-type") String type,
                                    @RequestParam (name = "lot-model") String lotModel,
                                    @RequestParam (name = "lot-descriptiom") String description){


        return "personalpage";
    }
}
