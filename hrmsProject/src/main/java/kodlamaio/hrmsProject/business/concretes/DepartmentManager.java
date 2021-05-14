package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.DepartmentService;
import kodlamaio.hrmsProject.dataAccess.abstracts.DepartmentDao;
import kodlamaio.hrmsProject.entities.concretes.DepartMent;

@Service
public class DepartmentManager implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}





	@Override
	public List<DepartMent> getall() {
		return this.departmentDao.findAll();
	}

}
