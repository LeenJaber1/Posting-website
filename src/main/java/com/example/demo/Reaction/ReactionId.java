package com.example.demo.Reaction;

import com.example.demo.Post.Post;
import com.example.demo.User.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ReactionId implements Serializable {
    private UserInfo usereaction;
    private Post postreaction;

}
