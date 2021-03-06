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
@Table(name="employees")
public class Employee implements IEntity{
	
	@Id
	@GeneratedValue
	
	@Column(name="user_id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	@Column(name="company_id")
	private int companyId;
	
	public Employee() {
		super();
	}

	public Employee(int id, String firstName, String lastName, int companyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyId = companyId;
	}
	
	

}
