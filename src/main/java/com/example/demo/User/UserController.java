package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        //UserInfo userInfo = userService.getUser();
        //String username = userInfo.getUsername();
        //String mobile = userInfo.getMobile();
        //String email = userInfo.getEmail();
        //if(mobile.equals(null)){
            //mobile = "No current phone number is found ";

    //}
        return  "hello ";//"Email : " + email + "\n"   + userInfo.getPassword()+ "\n" ;
    }

    @PutMapping(path = "/updateUsername/{newUsername}")
    public void UpdateUsername(@PathVariable("newUsername") String newusername){
        System.out.println("bye");
        //userService.changeUsername(newusername);
    }

    @PutMapping(path = "/updateEmail/{newEmail}")
    public void UpdateEmail(@PathVariable("newEmail") String newEmail){
        System.out.println("no");
        //userService.updateEmail(newEmail);
    }

    @PutMapping(path = "/updateMobile/{Mobile}")
    public void UpdateMobile(@PathVariable("Mobile") String newmobile){
        System.out.println("yes");
        //userService.addNewmobile(newmobile);
    }

    @PutMapping(path = "/updatePassword/{id}")
    public String UpdatePassword(@PathVariable Long id, @RequestParam(required = false) String newPassword){
        return "yok";
        //userService.changePassword(Password);
    }
















}
