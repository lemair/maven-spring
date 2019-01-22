package com.andreiluchian.myproject.MyProject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andreiluchian.myproject.MyProject.entities.Profesor;



@Repository
public interface ProfesorRepository extends CrudRepository<Profesor, Long>
{

}