package kodlamaio.hrms.business.abstracts.CandidateCVServices;

import java.util.List;

import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.candidateCV.Department;

public interface DepartmentService {
	public DataResult<List<Department>> getAll();
}
