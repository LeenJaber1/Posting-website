package com.example.demo.Profilepicture;

import com.example.demo.User.UserInfo;
import jakarta.persistence.*;

@Entity
@Table(name = "imageData")
public class ProfilePic {
    @Id
    @SequenceGenerator(name = "ProfilePic_sequence",
            sequenceName = "ProfilePic_sequence",
            allocationSize = 1)

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ProfilePic_sequence"
    )

    private Long profilepicId;



    @Lob
    @Column(name = "imagedata", length = 1000)
    private byte[] imageData;

    @ManyToOne
    private UserInfo userInfoPicture;
    public Long getProfilepicId() {
        return profilepicId;
    }

    public void setProfilepicId(Long profilepicId) {
        this.profilepicId = profilepicId;
    }
}
