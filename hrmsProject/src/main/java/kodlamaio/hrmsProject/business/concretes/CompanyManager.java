package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.CompanyService;
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
	public List<Company> getall() {
		
		return this.companyDao.findAll();
	}

}
