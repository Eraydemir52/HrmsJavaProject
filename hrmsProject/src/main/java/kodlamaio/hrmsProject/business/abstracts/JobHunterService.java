package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.entities.concretes.JobHunter;

public interface JobHunterService {

	 DataResult<List<JobHunter>> getall();
	 Result add(JobHunter jobHunter);
	 Result delete(JobHunter jobHunter);
	 Result update(JobHunter jobHunter);
}
