package kodlamaio.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsProject.business.abstracts.JobHunterService;
import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
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
	public DataResult<List<JobHunter>> getall(){
		
		return this.jobHunterService.getall();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobHunter jobHunter) {
		
	 return	this.jobHunterService.add(jobHunter);
	}

}
