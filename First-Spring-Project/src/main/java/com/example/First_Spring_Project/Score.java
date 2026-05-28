package com.example.First_Spring_Project;


import jakarta.persistence.Id;

import jakarta.persistence.Entity;

@Entity
public class Score {
	
	@Id
	Long id;
	String disp;
	
	public String getDisp() {
		return disp;
	}

	public void setDisp(String disp) {
		this.disp = disp;
	}

	public Score () {
		disp = "First Init";
	}
	
	public Score(String disp) {
		super();
		this.disp = disp;
	}

	@Override
	public String toString() {
		return "Score [disp=" + disp + "]";
	}


}
