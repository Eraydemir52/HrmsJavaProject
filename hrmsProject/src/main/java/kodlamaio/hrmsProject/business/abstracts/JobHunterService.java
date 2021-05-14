package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.entities.concretes.JobHunter;

public interface JobHunterService {

	 List<JobHunter> getall();
	 void add(JobHunter jobHunter);
}
