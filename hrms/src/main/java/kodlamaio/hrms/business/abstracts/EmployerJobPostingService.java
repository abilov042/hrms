package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.entities.concretes.jobPosting.EmployerJobPosting;

public interface EmployerJobPostingService {
	
	Result add(EmployerJobPosting employerJobPosting);
	DataResult<EmployerJobPosting> getById(int id);
	DataResult<List<EmployerJobPosting>> getAll();
	

}
