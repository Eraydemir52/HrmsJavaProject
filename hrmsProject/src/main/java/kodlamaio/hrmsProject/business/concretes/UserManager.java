package kodlamaio.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProject.business.abstracts.UserService;
import kodlamaio.hrmsProject.dataAccess.abstracts.UserDao;
import kodlamaio.hrmsProject.entities.concretes.User;

@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
    
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		
		return this.userDao.findAll();
	}

}
