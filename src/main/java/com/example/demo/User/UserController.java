package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "user/settings")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }


    @GetMapping(path = "/ProfileInformation")
    public String showAllUserInfo(){
        UserInfo userInfo = userService.getUser();
        String username = userInfo.getUsername();
        String mobile = userInfo.getMobile();
        String email = userInfo.getEmail();
        if(mobile.equals(null)){
            mobile = "No current phone number is found ";

        }
        return "Username : " + username + "\n" + "Email : " + email + "\n" + "Phone number : " + mobile + "\n" + "Date of birth : " + userInfo.getDateofbirth() + "\n" ;
    }



}
