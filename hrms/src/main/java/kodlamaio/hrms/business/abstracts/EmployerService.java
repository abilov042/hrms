package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.dtos.employerDto.EmployerDto;

public interface EmployerService {
	
	public Result add(EmployerDto employerDto);
	public DataResult<List<Employer>> getAll();
}
