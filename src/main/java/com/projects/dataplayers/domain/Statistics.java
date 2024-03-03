package com.projects.dataplayers.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer goals;
    private Integer assists;
    private Integer trophies;
    private Integer redCards;
    private Integer yellowCards;

    @ElementCollection
    private List<String> squads;

}
