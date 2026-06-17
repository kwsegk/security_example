package by.egor.spring_security_example.controller;

import by.egor.spring_security_example.entity.User;
import by.egor.spring_security_example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    private UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String homePage(){
        return "Page for everybody";
    }

    @GetMapping("/authenticated")
    public String securedPage(Principal principal){
        return "Page for authenticated users";
    }

    @GetMapping("/read_profile")
    public String readProfile() {
        return "Read profile page";
    }

    @GetMapping("/only_for_admins")
    public String pageOnlyForAdmins() {
        return "Only for admins page";
    }
}
