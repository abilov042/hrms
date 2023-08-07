package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.jobPosting.EmployerJobPosting;

public interface EmployerJobPostingDao extends JpaRepository<EmployerJobPosting, Integer>  {

}
