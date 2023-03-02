package net.codejava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.codejava.subject.SubjectService;

@Controller
public class SubjectController {
	
	@Autowired
	SubjectService subjectService;
	
	
	@RequestMapping("/subjects")
	public String getAllSubject(Model model) {
		model.addAttribute("subject", subjectService.getAllSubject());
		return "subject";
	}
	
}
