package kodlamaio.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsProject.business.abstracts.DepartmentService;
import kodlamaio.hrmsProject.core.utilities.results.DataResult;
import kodlamaio.hrmsProject.core.utilities.results.Result;
import kodlamaio.hrmsProject.entities.concretes.DepartMent;

@RestController
@RequestMapping("/api/departments")
public class DepartmentsController {
	@Autowired
	private DepartmentService departmentService;

	public DepartmentsController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}

	@GetMapping("/getall")
	public DataResult<List<DepartMent>> getall() {
		
		return this.departmentService.getall();
		
	}
	
	@PostMapping("/add")
	private Result add(@RequestBody DepartMent departMent) {
		return this.departmentService.add(departMent);
		

	}
}
