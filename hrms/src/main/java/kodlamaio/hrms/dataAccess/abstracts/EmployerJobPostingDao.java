package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.jobPosting.EmployerJobPosting;
import kodlamaio.hrms.entities.dtos.EmployerJobPostingWithCompanyDto;

//Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.numberOfJobOpenings
public interface EmployerJobPostingDao extends JpaRepository<EmployerJobPosting, Integer>  {
	
	@Query("From EmployerJobPosting where status=true Order By postingDate desc")
	List<EmployerJobPosting> getAllOrderByDate();
	
	@Query("From EmployerJobPosting where status=true")
	List<EmployerJobPosting> getAllActive();
	
	@Query("Select new kodlamaio.hrms.entities.dtos.EmployerJobPostingWithCompanyDto(c.companyName, j.positionName,e.numberOfJobOpenings , e.postingDate, e.deadline) From EmployerJobPosting e Inner Join e.employer c  Inner Join e.jobPosition j where status=true and companyName=:companyName")
	List<EmployerJobPostingWithCompanyDto> getEmployerJobPostingWithCompany(String companyName);
	
	
}
