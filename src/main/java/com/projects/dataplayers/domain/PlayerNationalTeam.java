package com.projects.dataplayers.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PlayerNationalTeam{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    protected Boolean callUpped;

    @ManyToOne
    @JoinColumn(name = "statistics_id")
    protected Statistics statistics;
}
