package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.entities.concretes.Candidate;

public interface CandidateService {
	public Result add(Candidate candidate);
	public DataResult<List<Candidate>> getAll();
}
