package kodlamaio.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProject.entities.concretes.DepartMent;

public interface DepartmentDao extends JpaRepository<DepartMent, Integer>{

}
