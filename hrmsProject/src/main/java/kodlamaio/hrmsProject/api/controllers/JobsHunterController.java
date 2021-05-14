package kodlamaio.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsProject.business.abstracts.JobHunterService;
import kodlamaio.hrmsProject.entities.concretes.JobHunter;

@RestController
@RequestMapping("/api/jobs_hunters")
public class JobsHunterController {
	
	
	@Autowired
	private JobHunterService jobHunterService;
	
	public JobsHunterController(JobHunterService jobHunterService) {
		super();
		this.jobHunterService = jobHunterService;
	}
	
	
	@GetMapping("/getall")
	public List<JobHunter> getall(){
		
		return this.jobHunterService.getall();
		
	}
	
	@GetMapping("/add")
	public void add(JobHunter jobHunter) {
		
		this.jobHunterService.add(jobHunter);
	}

}
