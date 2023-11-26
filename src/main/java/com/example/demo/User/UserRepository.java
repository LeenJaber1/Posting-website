package com.example.demo.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserInfo , Long> {



    Optional<UserInfo> findUserInfoByemail(String email);
    Optional<UserInfo> findUserInfoBymobile(String mobile);
    Optional<UserInfo> findUserInfoByusername(String username);
}
