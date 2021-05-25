package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.adapter.personValidator.CheckPersonService;
import kodlamaio.hrmsProject.business.abstracts.JobHunterService;
import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.ErrorResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsProject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsProject.dataAccess.abstracts.JobHunterDao;
import kodlamaio.hrmsProject.entities.concretes.JobHunter;

@Service
public class JobHunterManager implements JobHunterService {

	
	private JobHunterDao jobHunterDao;
	private CheckPersonService checkPersonService;
	
	@Autowired
	public JobHunterManager(JobHunterDao jobHunterDao) {
		super();
		this.jobHunterDao = jobHunterDao;
		
	}


	public JobHunterManager(CheckPersonService checkPersonService) {
		super();
		this.checkPersonService = checkPersonService;
	}


	@Override
	public DataResult<List<JobHunter>> getall() {
		
		return new SuccessDataResult<List<JobHunter>>(this.jobHunterDao.findAll(),"İşarayanlar  listeledi.");
	}


	@Override
	public Result add(JobHunter jobHunter) {
		
	   if(checkPersonService.checkPerson(jobHunter)) {
		   this.jobHunterDao.save(jobHunter);
		   System.out.println("Job hunter eklendi :"+jobHunter.getFirstName()+"  "+jobHunter.getLastName());
		   return new SuccessResult();
		   
	   }
	   
	return new ErrorResult("Üye bilgileri Hatalı."); 
			
		
		
		
	}


	@Override
	public Result delete(JobHunter jobHunter) {
		
		this.jobHunterDao.delete(jobHunter);
		return new SuccessResult("İş arayan silindi.");
	}


	@Override
	public Result update(JobHunter jobHunter) {
		this.jobHunterDao.save(jobHunter);
		return new SuccessResult("İş arayan güncellendi.");
		
	}


	
	
	

}
