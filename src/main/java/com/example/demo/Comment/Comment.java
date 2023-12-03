package com.example.demo.Comment;

import com.example.demo.Post.Post;
import com.example.demo.User.UserInfo;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Comment {
    @Id
    @SequenceGenerator(
            name = "comment_sequence",
            sequenceName = "comment_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "comment_sequence")
    private Long commentId;
    private String content;
    private LocalDate commentedAt;

    @ManyToOne
    private Post postComments;

    @ManyToOne
    private UserInfo userid;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCommentedAt() {
        return commentedAt;
    }

    public void setCommentedAt(LocalDate commentedAt) {
        this.commentedAt = commentedAt;
    }
}
