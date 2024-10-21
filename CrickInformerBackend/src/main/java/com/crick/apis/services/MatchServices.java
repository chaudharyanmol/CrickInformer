package com.crick.apis.services;

import java.util.List;
import java.util.Map;

import com.crick.apis.entities.Match;

public interface MatchServices {
	
	//get AllMatches 
	
	List<Match> getAllMatches();
	
	
	//getLive Matches
	List<Match> getLiveMatches();
	
	
	//get CWC2023 point table 
	
	List<List<String>>  getPointTable();
	
	

}
