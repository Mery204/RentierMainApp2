package com.rentier.rentierapp.model;


import com.rentier.rentierapp.model.IBaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@Entity
@AllArgsConstructor

public class Premises implements IBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String country;
    private String city;
    private String streetName;
    private String buildingNo;
    private String flatNo;
    private String roomNo;
    private int postCode;

    @Override
    public Long getId() {
        return null;
    }
}
