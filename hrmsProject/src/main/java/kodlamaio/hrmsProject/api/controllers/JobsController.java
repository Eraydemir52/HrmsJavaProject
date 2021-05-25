package kodlamaio.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsProject.business.abstracts.JobService;
import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.entities.concretes.Job;



@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	
	@Autowired
	private JobService jobService;
	
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}

	
	 @GetMapping("/getall")
	 
	 public DataResult<List<Job>> getall(){
		 
		 return this.jobService.getall();
	 }
	 
	 @PostMapping("/add")
	 
	 public Result add(@RequestBody Job job) {
		 return this.jobService.add(job);
	 }
	 
	 

}
