package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.EmployeeService;
import kodlamaio.hrmsProject.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrmsProject.entities.concretes.Employee;



@Service
public class EmployeeManager implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getall() {
		
		return this.employeeDao.findAll();
	}

}
