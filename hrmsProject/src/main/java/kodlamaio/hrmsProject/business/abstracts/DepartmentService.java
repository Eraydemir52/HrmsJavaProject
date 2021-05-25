package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.entities.concretes.Company;
import kodlamaio.hrmsProject.entities.concretes.DepartMent;

public interface DepartmentService {

	DataResult<List<DepartMent>> getall();
	Result add(DepartMent departMent);
	Result delete(DepartMent departMent);
	Result update(DepartMent departMent);
}
