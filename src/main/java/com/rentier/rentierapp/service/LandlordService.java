package com.rentier.rentierapp.service;

import com.rentier.rentierapp.model.Landlord;
import com.rentier.rentierapp.model.LandlordForm;
import com.rentier.rentierapp.repository.LandlordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LandlordService {


    @Autowired
    private LandlordRepository landlordRepository;

    public void add(LandlordForm landlordForm) {
        landlordRepository.save(landlord);
    }


    public List<Landlord> getBazaDanych() {
        return landlordRepository.findAll();
    }

}
