package kodlamaio.hrmsProject.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrmsProject.entities.abstracts.IEntity;
import lombok.Data;



@Data
@Entity
@Table(name="jobs_hunters")
public class JobHunter implements IEntity{
	
	@Id
	@GeneratedValue
	
	@Column(name="user_id")
	private int id;
	
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="birth_date")
	private Date  birthDate;
	
	@Column(name="national_identity")
	private String nationalIdentity;
	
	
	
	public JobHunter() {
		super();
	}
	public JobHunter(int id, String firstName, String lastName, Date birthDate, String nationalIdentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.nationalIdentity = nationalIdentity;
	}
	
	

}
