package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getall();
	Result add(Employer employer);
	Result delete(Employer employer);
	Result update(Employer employer);

}
