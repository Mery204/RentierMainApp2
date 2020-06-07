package com.rentier.rentierapp.repository;

import com.rentier.rentierapp.model.Landlord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LandlordRepository {
    List<Landlord> findAll();
    Object save(Landlord landlord);
}
