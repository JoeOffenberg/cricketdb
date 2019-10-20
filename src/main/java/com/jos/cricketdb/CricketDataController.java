package com.jos.cricketdb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class CricketDataController {
	
	@Autowired
    private CricketDataRepository cricketDataRepository;
	
	@GetMapping("/data")
    public List<CricketData> getCricketData() {
        return cricketDataRepository.findAll();
    }
	
	@PostMapping("/data")
    public CricketData createCricketData(@Valid @RequestBody CricketData cricketData) {
        return cricketDataRepository.save(cricketData);
    }
	
	

}
