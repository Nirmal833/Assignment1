package com.customer.dto;

import com.customer.util.Citizenship;
import com.customer.util.Gender;

import lombok.Data;



@Data
public class CustomerDto {

	
	
	private String uidNumber;

	private String name;

	private Gender gender;

	

	private String dob;
	private String address;
	 
	
	private String profession;

	private Citizenship citizenship;
	private Double openingBalance;
	
	
	
}
