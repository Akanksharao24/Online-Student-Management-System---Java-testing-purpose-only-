package com.management.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.entity.Student;
import com.management.repository.Studentrepository;
import com.management.service.StudentService;
@Service

public class Serviceimpl  implements StudentService{
	@Autowired
	com.management.repository.Studentrepository Studentrepository;
	
	@Override
	public List<Student> getAllStudents() {
		List<Student> list= Studentrepository.findAll();
		return list;
	}
	@Override
	public Student saveStudent(Student student)  {
		return Studentrepository.save(student);
	}
	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return Studentrepository.findById(id).get();
	}
	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Studentrepository.deleteById(id);
		
		
	}
	

}
