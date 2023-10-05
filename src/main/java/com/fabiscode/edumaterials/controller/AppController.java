package com.fabiscode.edumaterials.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/mobile_app")
	public String mobilApp() {
		return "mobile";
	}
	
	@RequestMapping("/project_topic")
	public String projectTopic() {
		return "project_topic";
	}
	
	@RequestMapping("/stat-top")
	public String statTop() {
		return "stat";
	}
	@RequestMapping("/stabdrate")
	public String stabdr() {
		return "stabdrate";
	}

	@RequestMapping("/staIndAccid")
	public String statIndAccd() {
		return "stat_industral_accident";
	}
	@RequestMapping("/staApriasalAccidRate")
	public String statApriasalAccidentRate() {
		return "stat_apprasal_accd_rate";
	}
	@RequestMapping("/stat/motality_death_rate_on_women_agegroup")
	public String statMotalityDeathRateOnWomenAgeGroup() {
		return "stat_motality_death_rate_on_women_agegroup";
	}


}
