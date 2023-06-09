package com.martinatanasov.springexample.controller;

import com.martinatanasov.springexample.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    //@PostMapping
    @GetMapping("/register")
    public String userRegister(@ModelAttribute User user){
        System.out.println(user.toString());
        return "register";
    }

    @GetMapping("/login")
    public String userLogin(String email, String password, Model model){
        System.out.println("Email: " + email + "\n" + "Pass: " + password);

        model.addAttribute("email", email);
        return "login";
    }

//    @GetMapping("/hello")
//    public String sayHello(Model theModel) {
//
//        theModel.addAttribute("Mario", new java.util.Date());
//
//        return "userControlPanel";
//    }
}
