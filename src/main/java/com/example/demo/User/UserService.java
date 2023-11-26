package com.example.demo.User;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.JstlUtils;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;
    private UserInfo user;
    @Autowired
    public UserService(UserRepository userRepositoryr){
        this.userRepository = userRepository;

    }

    public UserService(UserInfo user) {
        this.user = user;
    }


    //works for updating and adding a new phone number
    public void addNewmobile(String newmobile){
        UserInfo check = userRepository.findUserInfoBymobile(newmobile).orElseThrow(() -> new IllegalStateException("Mobile number is already taken!"));
        if(newmobile!=null && newmobile.length()==10 ){
            this.user.setMobile(newmobile);
        }

    }

    public UserInfo getUser() {
        return user;
    }

    public void deleteAccount(){
        userRepository.deleteById(user.getId());
    }

    public void updateEmail(String email){
        UserInfo check = userRepository.findUserInfoByemail(email).orElseThrow(() -> new IllegalStateException("email is already taken!"));
        if(email!=null){
            this.user.setEmail(email);
        }

    }

    public void deleteMobile(){
        this.user.setMobile("null");
    }

    public void changePassword(String pass){
        if(pass.equals(user.getPassword())){
            throw new IllegalStateException("You need a different password than your original one!");
        }
        if(pass==null){
            throw new IllegalStateException("Password can't be an empty string");
        }
        this.user.setPassword(pass);
    }

    public void changeUsername(String newuser){
        UserInfo check = userRepository.findUserInfoByusername(newuser).orElseThrow(() -> new IllegalStateException("User name  is already taken!"));
        if(newuser!=null){
            this.user.setUsername(newuser);
        }
    }












}
