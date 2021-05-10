package kodlamaio.hrmsProject.entities.concretes;

import java.lang.annotation.Annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrmsProject.entities.abstracts.IEntity;
import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User  implements IEntity {
	@Id
	@GeneratedValue
	
	@Column(name="user_id")
	private int id;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	public User() {
		super();
	}
	public User(int id, String password, String email) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
	}
	

}
