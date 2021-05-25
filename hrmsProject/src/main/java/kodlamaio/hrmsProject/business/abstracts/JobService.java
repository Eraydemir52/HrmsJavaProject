package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.entities.concretes.Job;

 public interface JobService {
	DataResult<List<Job>> getall();
	Result add(Job job);
	Result delete(Job job);
	Result update(Job job);

 }
