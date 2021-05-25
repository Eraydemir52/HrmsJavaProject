package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.entities.concretes.DepartMent;
import kodlamaio.hrmsProject.entities.concretes.Employee;

public interface EmployeeService {
	DataResult<List<Employee>> getall();
	Result add(Employee employee);
	Result delete(Employee employee);
	Result update(Employee employee);
	

}
