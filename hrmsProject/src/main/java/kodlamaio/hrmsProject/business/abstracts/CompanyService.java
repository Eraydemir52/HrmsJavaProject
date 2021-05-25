package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.entities.concretes.Company;


public interface CompanyService {
	DataResult<List<Company>> getall();
	Result add(Company company);
	Result delete(Company company);
	Result update(Company company);

}
