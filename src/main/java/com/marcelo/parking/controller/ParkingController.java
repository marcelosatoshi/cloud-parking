package com.marcelo.parking.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcelo.parking.controller.dto.ParkingDTO;
import com.marcelo.parking.controller.mapper.ParkingMapper;
import com.marcelo.parking.model.Parking;
import com.marcelo.parking.service.ParkingService;

@RestController
@RequestMapping("/parking")
public class ParkingController {
	
	@Autowired
	private ParkingService parkingService;
	
	private ParkingMapper parkingMapper;
	
	public ParkingController(ParkingService parkingService, ParkingMapper parkingMapper) {
		this.parkingService = parkingService;
		this.parkingMapper = parkingMapper;
	}

	@GetMapping
	public  List<ParkingDTO>  findAll() {
		List<Parking> parkingList = parkingService.findAll();
		List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkingList);
		return result;
	}
}
