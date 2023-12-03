package com.example.demo.Relationship;

import com.example.demo.User.UserInfo;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Relationship {
    @Id
    @SequenceGenerator(name = "relationship_sequence",
            sequenceName = "relationship_sequence",
            allocationSize = 1)

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "relationship_sequence"
    )
    @Column(name = "relationshipId")
    private Long relationshipId;

    @ManyToOne
    private UserInfo userInfoRelationships;



    @Column(name ="Status" , nullable = false)
    private String typeOfRelationship;
    @Column(name = "startOfRelationship" , nullable = false)
    private LocalDate startOfRelationship;

    public Long getRelationshipId() {
        return relationshipId;
    }

    public void setRelationshipId(Long relationshipId) {
        this.relationshipId = relationshipId;
    }

    public String getTypeOfRelationship() {
        return typeOfRelationship;
    }

    public void setTypeOfRelationship(String typeOfRelationship) {
        this.typeOfRelationship = typeOfRelationship;
    }

    public LocalDate getStartOfRelationship() {
        return startOfRelationship;
    }

    public void setStartOfRelationship(LocalDate startOfRelationship) {
        this.startOfRelationship = startOfRelationship;
    }


}
