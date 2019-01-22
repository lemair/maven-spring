package com.andreiluchian.myproject.MyProject.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andreiluchian.myproject.MyProject.entities.Student;


@Repository
public interface StudentRepository extends CrudRepository<Student, Long>
{

}