package com.example.demo.Reaction;


import com.example.demo.Post.Post;
import com.example.demo.User.UserInfo;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table
@IdClass(Reaction.class)
public class Reaction  implements Serializable {





    @Id
    @ManyToOne
    private UserInfo usereaction;
    @Id
    @ManyToOne
    private Post postreaction;

    private String reactiontype;
    private LocalDate createdat;





    public String getReactiontype() {
        return reactiontype;
    }

    public void setReactiontype(String reactiontype) {
        this.reactiontype = reactiontype;
    }

    public LocalDate getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDate createdat) {
        this.createdat = createdat;
    }

    public UserInfo getUser() {
        return usereaction;
    }

    public void setUser(UserInfo user) {
        this.usereaction = user;
    }

    public Post getPost() {
        return postreaction;
    }

    public void setPost(Post post) {
        this.postreaction = post;
    }
}
