package com.ssi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.dao.StudentDAO;
import com.ssi.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public void studentEntry(Student student) {
		studentDAO.addStudent(student);
	}

	public void deleteStudent(int code) {
		studentDAO.removeStudent(code);
	}

	public void changeStudentDetails(Student student) {
		studentDAO.updateStudent(student);
	}

	public Student searchStudent(int code) {
		return studentDAO.getStudentById(code);
	}

	public Student updateStudent(Student student) {
		return studentDAO.updateStudents(student);
	}

	public List<Student> viewAllStudents() {
		return studentDAO.getAllStudents();
	}

}
