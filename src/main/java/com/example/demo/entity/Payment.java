package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private String description;
    private String status; // e.g., "Completed", "Pending"
	public Object getAmount() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setAmount(Object amount2) {
		// TODO Auto-generated method stub
		
	}
	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setDescription(Object description2) {
		// TODO Auto-generated method stub
		
	}
	public Object getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}

