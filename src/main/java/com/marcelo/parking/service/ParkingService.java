package com.marcelo.parking.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.marcelo.parking.model.Parking;

@Service
public class ParkingService {

	private static Map<String, Parking> parkingMap = new HashMap();
	
	
	static {
		String id  = getUUID();
		Parking parking = new Parking(id, "DMS 1111", "RJ","Corolla", "Preto");
		parkingMap.put(id, parking);
	}
	
	public List<Parking> findAll() {
		return parkingMap.values().stream().toList();
		
	}
	
	private static String getUUID() {
		return UUID.randomUUID().toString();
	}
}
