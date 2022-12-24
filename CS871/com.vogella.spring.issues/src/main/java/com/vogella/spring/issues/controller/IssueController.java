package com.vogella.spring.issues.controller;

import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.vogella.spring.issues.entities.IssueReport;
import com.vogella.spring.issues.repositories.IssueRepository;

@Controller
public class IssueController {
	
	IssueRepository issueRepository;
	
	IssueController (IssueRepository issueRepository){
		this.issueRepository = issueRepository;
	}
		
	@GetMapping("issuereport")
	public String getReport (Model model) {
		model.addAttribute("issuereport", new IssueReport());
		return "issues/issuereport_form";
	}
	
	@PostMapping("/issuereport") 
	public String submitReport(IssueReport issueReport, Model model) {
		model.addAttribute("issuereport", new IssueReport());
		model.addAttribute("submitted", true);
		return "issues/issuereport_form";
	}
	
	@GetMapping("/issues")
	public String getIssues () {		
		return "issues/issuereport_list";
	}

}
