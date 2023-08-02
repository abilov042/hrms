package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {
	public DataResult<List<Employer>> getAll();
}
