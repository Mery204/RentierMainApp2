package com.rentier.rentierapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@Entity
@AllArgsConstructor


public class Landlord implements IBaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;

    @Override
    public Long getId() {
        return null;
    }


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "premises")
    private List<Grade> gradeList;
}
