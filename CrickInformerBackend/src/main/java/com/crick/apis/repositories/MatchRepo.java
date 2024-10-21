package com.crick.apis.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.apis.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer> {
	
	// wanna fetch match when we provides the team Name & we can find matchHeading  as 
	
	Optional<Match> findByTeamHeading(String teamHeading);
	

}


