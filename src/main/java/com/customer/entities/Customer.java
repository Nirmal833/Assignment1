package com.customer.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.customer.generators.SequenceGenerator;
import com.customer.util.Citizenship;
import com.customer.util.Gender;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Customer {
	
	@Id
	@GeneratedValue(generator = "customer_id",strategy = GenerationType.SEQUENCE)
	@GenericGenerator(name = "customer_id",strategy = "com.customer.generators.SequenceGenerator",
		parameters = {@Parameter(name = SequenceGenerator.Number_Format_Parameter,value = "%016d")})
	//@SequenceGenerator(name="customer_id",initialValue =100,allocationSize = 1)
	@Column(name = "uid_number",nullable = false)
	private String uidNumber;

	private String name;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	

	private String dob;
	private String address;
	 
	
	private String profession;

	@Enumerated(EnumType.STRING)
	private Citizenship citizenship;

	

	private Double openingBalance;

}