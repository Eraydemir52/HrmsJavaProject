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
@Table(name="company")
public class Company implements IEntity{
	
	@Id
	@GeneratedValue
	
	@Column(name="id")
    private int id;
	
	@Column(name="company_name")
    private String companyName;
    
	public Company() {
		super();
	}

	public Company(int id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
	}
    

}
