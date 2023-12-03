package com.example.demo.Post;

import com.example.demo.Comment.Comment;
import com.example.demo.Reaction.Reaction;
import com.example.demo.User.UserInfo;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table
public class Post {
    @Id
    @SequenceGenerator(
            name = "post_sequence",
            sequenceName = "post_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "post_sequence")
    private Long postId;
    private String content;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @ManyToOne
    private UserInfo userInfoPosts;


    @OneToMany(mappedBy = "postComments")
    private Set<Comment> postcomments;

    @OneToMany(mappedBy = "postreaction")
    private Set<Reaction> postReactions;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }
}
