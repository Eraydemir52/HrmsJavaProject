package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.DepartmentService;
import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsProject.core.utilities.results.SuccessResult;
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
	public DataResult<List<DepartMent>> getall() {
		return new SuccessDataResult<List<DepartMent>>(this.departmentDao.findAll(),"Departmanlar listelendi.");
	}





	@Override
	public Result add(DepartMent departMent) {
		this.departmentDao.save(departMent);
		return new SuccessResult("Departman kayıtedildi.");
		
	}





	@Override
	public Result delete(DepartMent departMent) {
	this.departmentDao.delete(departMent);
	return new SuccessResult("Departman silindi.");
		
	}





	@Override
	public Result update(DepartMent departMent) {
	this.departmentDao.save(departMent);
	return new SuccessResult("Departman güncellendi.");
		
	}

}
