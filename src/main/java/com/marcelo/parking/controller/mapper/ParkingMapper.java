package com.marcelo.parking.controller.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.marcelo.parking.controller.dto.ParkingDTO;
import com.marcelo.parking.model.Parking;

@Component
public class ParkingMapper {
	
	private static final ModelMapper  MODEL_MAPPER = new ModelMapper();
	
	public ParkingDTO parkingDTO(Parking parking) {
		return MODEL_MAPPER.map(parking, ParkingDTO.class);
	}
	

	public List<ParkingDTO> toParkingDTOList(List<Parking> parkingList) {
		return parkingList.stream().map(this::parkingDTO).toList();
	}
}
