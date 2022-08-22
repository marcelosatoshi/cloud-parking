package com.marcelo.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.parking.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}