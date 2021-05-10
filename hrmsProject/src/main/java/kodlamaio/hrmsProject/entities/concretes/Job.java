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
@Table(name="jobs")
public class Job implements IEntity{
	
	@Id
	@GeneratedValue
	
	@Column(name = "job_id")
	private int job_id;
	
	@Column(name="name")
	private String name;
	
	
	public Job() {
		super();
	}
	public Job(int job_id, String name) {
		super();
		this.job_id = job_id;
		this.name = name;
	}

}
