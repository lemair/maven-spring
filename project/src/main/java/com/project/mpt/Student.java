package com.project.mpt;
import java.awt.*;
import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="students")

public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Basic(optional = false)
	private Long Id;
	@Column(name = "Nume", nullable = false)
	private String Nume;
	
	public Long getId( ) {
		return Id;
		
	
	}
	public String getNume() {
		return Nume;
	}
	public void setNume(String name) {
		Nume = Nume;
	}
	
}
