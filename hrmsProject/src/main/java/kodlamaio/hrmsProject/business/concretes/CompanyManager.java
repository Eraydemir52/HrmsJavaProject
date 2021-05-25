package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.CompanyService;
import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsProject.core.utilities.results.SuccessResult;
import kodlamaio.hrmsProject.dataAccess.abstracts.CompanyDao;
import kodlamaio.hrmsProject.entities.concretes.Company;

@Service
public class CompanyManager implements CompanyService{

	@Autowired
	private CompanyDao companyDao;
	
	public CompanyManager(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}





	@Override
	public DataResult<List<Company>> getall() {
		
		return new SuccessDataResult<List<Company>>(this.companyDao.findAll(),"Şirketler listelendi.");
	}





	@Override
	public Result add(Company company) {
		this.companyDao.save(company);
		return new SuccessResult("Şirket eklendi.");
		
	}





	@Override
	public Result delete(Company company) {
	this.companyDao.delete(company);
	return new SuccessResult("Şirket silindi.");
		
	}





	@Override
	public Result update(Company company) {
		this.companyDao.save(company);
		return new SuccessResult("Şirket güncellendi.");
		
	}

}
