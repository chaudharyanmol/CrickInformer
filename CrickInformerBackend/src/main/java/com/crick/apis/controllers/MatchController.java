package com.crick.apis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.apis.entities.Match;
import com.crick.apis.services.MatchServices;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {
	
	
	@Autowired
	private MatchServices matchService ;
	
	
	
	//live matches 
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches(){
		return new  ResponseEntity<>(this.matchService.getLiveMatches(),HttpStatus.OK);
		
	}
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Match>> getAllMatches(){
		return new  ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
		
	}
	
	
	
	@RequestMapping("/point-table")
	public ResponseEntity<?> getPointTable(){
		return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
	}
	
	
	
	
	
	

}
