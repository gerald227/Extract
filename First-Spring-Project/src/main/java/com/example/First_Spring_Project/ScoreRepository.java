package com.example.First_Spring_Project;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


  @Repository 
  public interface ScoreRepository extends CrudRepository<Score,
  Long> {
  
  }
 
