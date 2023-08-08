package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.entities.concretes.jobPosting.EmployerJobPosting;
import kodlamaio.hrms.entities.dtos.EmployerJobPostingDto;
import kodlamaio.hrms.entities.dtos.EmployerJobPostingWithCompanyDto;

public interface EmployerJobPostingService {
	
	Result add(EmployerJobPosting employerJobPosting);
	DataResult<EmployerJobPosting> getById(int id);
	DataResult<List<EmployerJobPostingDto>> getAll();
	DataResult<List<EmployerJobPostingDto>> getAllOrderBy();
	DataResult<List<EmployerJobPostingDto>> getAllActive();
	DataResult<List<EmployerJobPostingWithCompanyDto>> getEmployerJobPostingWithCompany(String companyName);
	Result updateStatus(int employerJobPostingId);
	

}
