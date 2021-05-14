package kodlamaio.hrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrmsProject.entities.abstracts.IEntity;
import lombok.Data;

@Data
@Entity
@Table(name="departments")
public class DepartMent implements IEntity {
	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	@Column(name="department_name")
	private String departmentName;
	
	
	
	public DepartMent() {
		super();
	}
	
	public DepartMent(int id, String departmentName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
	}
	

}
