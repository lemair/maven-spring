package com.andreiluchian.myproject.MyProject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andreiluchian.myproject.MyProject.entities.Nota;

@Repository
public interface GradeRepository extends CrudRepository<Nota, Long> {

	public Iterable<Nota> findAllByStudentId(Long studentId);

	public Iterable<Nota> findAllByStudentIdAndProfesorId(Long studentId, Long profesorId);

}