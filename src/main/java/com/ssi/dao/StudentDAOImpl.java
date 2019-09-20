package com.ssi.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ssi.entities.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addStudent(Student student) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(student);
		tr.commit();
		session.close();
	}

	public void removeStudent(int code) {
		Session session = sessionFactory.openSession();
		Student student = session.get(Student.class, code);
		Transaction tr = session.beginTransaction();
		session.delete(student);
		tr.commit();
		session.close();
	}

	public void updateStudent(Student student) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(student);
		tr.commit();
		session.close();
	}

	public Student getStudentById(int code) {
		Session session = sessionFactory.openSession();
		Student student = session.get(Student.class, code);
		session.close();
		return student;
	}

	public List<Student> getAllStudents() {
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Student.class);
		List<Student> students = cr.list();
		session.close();
		return students;
	}

	public Student updateStudents(Student students) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		students.setBranch(students.getBranch());
		students.setName(students.getName());
		students.setSem(students.getSem());
		session.update(students);
		tr.commit();
		session.close();
		return students;
	}

}
