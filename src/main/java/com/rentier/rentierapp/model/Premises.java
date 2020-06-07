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


    @ManyToOne()
    private Landlord landlord;

    @OneToMany(mappedBy = "premises")
    private List<Tenant> tenantList;

}
