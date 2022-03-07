package com.ProyekInformatika.TrainManager.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ProyekInformatika.TrainManager.Repository.*;
import com.ProyekInformatika.TrainManager.Model.*;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TrainController {
	@Autowired
	TrainRepository trainRepository;
	
	@PostMapping("/trains")
	public ResponseEntity<Train> createTrain(@RequestBody Train train){
		try {
			Train _train = trainRepository.save(train);
			return new ResponseEntity<>(_train, HttpStatus.CREATED);
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
