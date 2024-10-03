package com.parents.parentsdemo.entity;

import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "Family")
public class ParentsEntity {
	
	@Id
	@GeneratedValue( generator = "UUID" )
    @Column(name="Family_Id")
	private UUID familyId;
	
	@Column(name= "Father_Names")
	private String fatherName; 
	
	@Column(name= "Mother_Names")
	private String motherName;

}
