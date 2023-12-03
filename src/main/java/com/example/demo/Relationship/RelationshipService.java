package com.example.demo.Relationship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationshipService {
    private final RelationshipRepository relationshipRepository;


    @Autowired
    public RelationshipService(RelationshipRepository relationshiprepository) {
        this.relationshipRepository = relationshiprepository;
    }
}
