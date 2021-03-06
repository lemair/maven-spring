package com.andreiluchian.myproject.MyProject.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "PROFESORI" )
public class Profesor implements Serializable {

	private static final long serialVersionUID = -2539687685678279338L;

	@Id
	@GeneratedValue ( strategy = GenerationType.SEQUENCE)
	@Basic (optional = false)
	private Long id;
	
	@Column ( name = "NUME", nullable = false, unique = false)
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", name=" + name + "]";
	}

}
