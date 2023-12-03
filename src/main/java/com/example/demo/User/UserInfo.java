package com.example.demo.User;

import com.example.demo.Comment.Comment;
import com.example.demo.Post.Post;
import com.example.demo.Profilepicture.ProfilePic;
import com.example.demo.Reaction.Reaction;
import com.example.demo.Relationship.Relationship;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table
public class UserInfo {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    @Column(name = "userID")
    private Long id;

    @Column(name = "Username", unique = true )
    public String username;

    @Column(name = "email" , unique = true , nullable = false)
    private String email;
    @Column(name = "Password"  , nullable = false)
    private String password;
    @Column(name = "mobile" , unique = true )
    private String mobile;
    @Column(name = "Date of birth"  )
    private LocalDate dateofbirth;

    @OneToMany(mappedBy = "userInfoPicture")
    private Set<ProfilePic> profilePicSet;


    @OneToMany(mappedBy = "userInfoRelationships")
    private Set<Relationship> relationshipSet;

    @OneToMany(mappedBy = "userInfoPosts")
    private Set<Post> postsSet;


    @OneToMany(mappedBy = "userid")
    private Set<Comment> commentsSet;

    @OneToMany(mappedBy = "usereaction")
    private Set<Reaction> reactionSet;






    public Set<ProfilePic> getProfilePicSet() {
        return profilePicSet;
    }



    public UserInfo() {
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public UserInfo(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
