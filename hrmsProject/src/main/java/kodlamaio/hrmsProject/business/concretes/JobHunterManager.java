package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.adapter.personValidator.CheckPersonService;
import kodlamaio.hrmsProject.business.abstracts.JobHunterService;
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
	public List<JobHunter> getall() {
		
		return this.jobHunterDao.findAll();
	}


	@Override
	public void add(JobHunter jobHunter) {
		
	   if(checkPersonService.checkPerson(jobHunter)) {
		   this.jobHunterDao.save(jobHunter);
		   System.out.println("Job hunter eklendi :"+jobHunter.getFirstName()+"  "+jobHunter.getLastName());
		   
	   }
	   else {
			System.out.println("Üye Bilgileri Hatali");
		}	
		
		
		
	}
	

}
