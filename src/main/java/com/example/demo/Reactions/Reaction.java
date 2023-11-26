package com.example.demo.Reactions;


import jakarta.persistence.*;
import org.apache.catalina.User;

@Entity
@Table
public class Reaction {
    @Id
    @SequenceGenerator(
            name = "Reaction_sequence",
            sequenceName = "Reaction_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Reaction_sequence"
    )
    private long reactionID;




    public long getReactionID() {
        return reactionID;
    }

    public void setReactionID(long reactionID) {
        this.reactionID = reactionID;
    }


}
