package com.andreiluchian.myproject.MyProject.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreiluchian.myproject.MyProject.entities.Student;
import com.andreiluchian.myproject.MyProject.repositories.StudentRepository;

@Service
public class StudentService
{

    @Autowired
    private StudentRepository studentRepository;

    public Optional<Student> findById( Long id )
    {
        return studentRepository.findById( id );
    }
    
    public Student addStudent( Student s )
    {
    	if (s.getName().length() > 100)
    	{
    		s.setName(s.getName().substring(0, 99));
    		return studentRepository.save(s);
    	}   	
    	else
    	{
    		return studentRepository.save(s);
    	}
    }

    public List<Student> findAll( )
    {
        return StreamSupport.stream( studentRepository.findAll( ).spliterator( ), false ).collect( Collectors.toList( ) );
    }

}