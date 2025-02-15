package com.kh.yist.spring.instructor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class instructorController {
	
	@RequestMapping("taskForm.ins")
	public String taskForm() {
		return "instructor/taskForm";
	}
	
	@RequestMapping("examForm.ins")
	public String examForm() {
		return "instructor/examForm";
	}
	
	@RequestMapping("gradeForm.ins")
	public String gradeForm() {
		return "instructor/gradeForm";
	}
	
	@RequestMapping("studentForm.ins")
	public String studentForm() {
		return "instructor/studentForm";
	}
	
	@RequestMapping("main.ins")
	public String main() {
		return "instructor/main";
	}
	
	@RequestMapping("yistcheck.ins")
	public String yistcheck() {
		return "instructor/yistcheck";
	}
	
	@RequestMapping("teacher.ins")
	public String teacher() {
		return "instructor/teacher";
	}
	
}
