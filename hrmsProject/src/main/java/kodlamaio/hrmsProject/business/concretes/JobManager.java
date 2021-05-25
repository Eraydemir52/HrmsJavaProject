package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.JobService;
import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsProject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsProject.dataAccess.abstracts.JobDao;
import kodlamaio.hrmsProject.entities.concretes.Job;

@Service
public class JobManager implements JobService{

	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}


	@Override
	public DataResult<List<Job>> getall() {
		
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll(),"İşler listelendi.");
	}


	@Override
	public Result add(Job job) {
	  this.jobDao.save(job);
	  return new SuccessResult("Job iş eklendi");
	}


	@Override
	public Result delete(Job job) {
		this.jobDao.delete(job);
		return new SuccessResult("İş silindi");
		
	}


	@Override
	public Result update(Job job) {
		this.jobDao.save(job);
		
		return new SuccessResult("İş güncellendi");
	}

}
