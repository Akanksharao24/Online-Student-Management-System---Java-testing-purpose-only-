package com.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.entity.Student;
@Repository

public interface Studentrepository extends JpaRepository<Student,Integer> {

	

}
