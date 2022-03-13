package com.ProyekInformatika.TrainManager.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ProyekInformatika.TrainManager.Repository.*;
import com.ProyekInformatika.TrainManager.Model.*;

@RestController
@RequestMapping("")
public class TrainController {
	@Autowired
	TrainRepository trainRepository;
	
	@PostMapping("/trains")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')") // Kalo user login sebagai user biasa atau admin boleh akses
	public ResponseEntity<List<Train>> createTrain(@RequestBody List<Train> trains){
		try {
			for(Train t : trains) System.out.println(t.toString());
			List<Train> _train = trainRepository.saveAll(trains);
			return new ResponseEntity<>(_train, HttpStatus.CREATED);
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/trains")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')") // Kalo user login sebagai user biasa atau admin boleh akses
	public ResponseEntity<Map<String, Object>> getTrains(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size,
			@RequestParam(defaultValue = "id,desc") String[] sort){
		
		try {
			List<Order> orders = new ArrayList<Order>();
			if(sort[0].contains(",")) {
				//sortir lebih dari 2 buah fields
				for(String sortOrder : sort) {
					String[] _sort = sortOrder.split(",");
					if(_sort[0].equals("max-speed")) _sort[0] = "maxSpeed";
					orders.add(new Order(getSortDirection(_sort[1]), _sort[0]));
				}
			} else {
				//sort=[field,direction]
				if(sort[0].equals("max-speed")) sort[0] = "maxSpeed";
				orders.add(new Order(getSortDirection(sort[1]), sort[0]));
			}
			
			List<Train> trains = new ArrayList<Train>();
			Pageable pagingSort = PageRequest.of(page, size, Sort.by(orders));
			Page<Train> pageTrains = trainRepository.findAll(pagingSort);
			
			trains = pageTrains.getContent();
			if(trains.isEmpty()) return new ResponseEntity<>(HttpStatus.NO_CONTENT); //kalau table nya kosong
			
			Map<String, Object> response = new HashMap<>();
			response.put("trains", trains);
			response.put("currentPage", pageTrains.getNumber());
			response.put("totalItems", pageTrains.getTotalElements());
			response.put("totalPages", pageTrains.getTotalPages());
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	public Sort.Direction getSortDirection(String s){
		return s.equals("desc")? Sort.Direction.DESC:Sort.Direction.ASC;
	}

}
