package com.ssi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.entities.Student;
import com.ssi.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("removestudent")
	public String remove() {
		return "remove";
	}

	@RequestMapping("remove")
	public ModelAndView deleteStudent(@RequestParam("rno") int code) {
		studentService.deleteStudent(code);
		ModelAndView mv = new ModelAndView("redirect:viewall");
		return mv;
	}

	@RequestMapping("viewall")
	public ModelAndView showAllRecords() {
		List<Student> students = studentService.viewAllStudents();
		ModelAndView mv = new ModelAndView("studentlist");
		mv.addObject("students", students);
		return mv;
	}

	@RequestMapping("search")
	public String search() {
		return "search";
	}

	@RequestMapping("searchid")
	public ModelAndView search(@RequestParam("rno") int code) {
		Student students = studentService.searchStudent(code);
		ModelAndView mv = new ModelAndView("searchresult");
		mv.addObject("students", students);
		return mv;
	}

	@RequestMapping("dataentry")
	public String showDataEntryForm() {
		return "dataentry";
	}

	@RequestMapping("savestudent")
	public ModelAndView saveStudentInfo(@ModelAttribute("student") Student student) {
		studentService.studentEntry(student);
		ModelAndView mv = new ModelAndView("saveconfirm");
		return mv;
	}

	@RequestMapping("update")
	public String update() {
		return "update";
	}

	@RequestMapping("updatestudent")
	public ModelAndView updatestudent(@ModelAttribute("student") Student student) {
		Student students = studentService.updateStudent(student);
		ModelAndView mv = new ModelAndView("updateresult");
		mv.addObject("students", students);
		return mv;
	}
}

// ModelAndView mv=new ModelAndView("redirect:viewallstudents");
