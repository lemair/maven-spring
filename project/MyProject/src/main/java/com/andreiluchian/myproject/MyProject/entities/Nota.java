package com.andreiluchian.myproject.MyProject.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn; 
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table (name = "NOTE")
public class Nota implements Serializable{
	
	private static final long serialVersionUID = 2382928549416936934L;
	
	@Id
	@GeneratedValue ( strategy = GenerationType.SEQUENCE)
	@Basic (optional = false)
	private Long id;
	
	@Column ( name = "NOTA", nullable = false, unique = false)
	private Integer grade;
	
	@ManyToOne
	@JoinColumn(name = "ID_STUDENT", referencedColumnName = "ID")
	@JsonBackReference
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "ID_PROFESOR", referencedColumnName = "ID")
	@JsonBackReference
	private Profesor profesor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "Nota [id=" + id + ", grade=" + grade + ", student=" + student + ", profesor=" + profesor + "]";
	}
}
