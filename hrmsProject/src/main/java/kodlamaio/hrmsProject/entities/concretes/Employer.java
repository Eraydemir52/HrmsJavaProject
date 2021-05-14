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
@Table(name="employers")
public class Employer implements IEntity{

	@Id
	@GeneratedValue
	
	
	@Column(name="user_id")
	private int  id;
	
	@Column(name="website")
	private String webSite;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="department_id")
	private int departmentId;
	
	
	
	public Employer() {
		super();
	}



	public Employer(int id, String webSite, String phoneNumber, String companyName, int departmentId) {
		super();
		this.id = id;
		this.webSite = webSite;
		this.phoneNumber = phoneNumber;
		this.companyName = companyName;
		this.departmentId = departmentId;
	}
	
	
}
