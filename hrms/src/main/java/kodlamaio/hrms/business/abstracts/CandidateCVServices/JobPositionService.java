package kodlamaio.hrms.business.abstracts.CandidateCVServices;

import java.util.List;

import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.jobPosting.JobPosition;

public interface JobPositionService {
	public DataResult<List<JobPosition>> getAll();

}
