package kodlamaio.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProject.entities.concretes.Company;

public interface CompanyDao extends JpaRepository<Company, Integer> {

}
