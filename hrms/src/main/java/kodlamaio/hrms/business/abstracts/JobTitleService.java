package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	public DataResult<List<JobTitle>> getAll();
}
