package kodlamaio.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProject.entities.concretes.JobHunter;

public interface JobHunterDao extends JpaRepository<JobHunter, Integer> {

}
