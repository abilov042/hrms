package kodlamaio.hrms.business.abstracts.CandidateCVServices;

import java.util.List;

import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.entities.concretes.candidateCV.CandidateCV;

public interface CandidateCVService {
	public Result add(CandidateCV candidateCV);
	public DataResult<List<CandidateCV>> getAll();
	public DataResult<List<CandidateCV>> getEndDateDesc();
	public DataResult<List<CandidateCV>> getEndDateNull();
	public DataResult<List<CandidateCV>> getActivityYearDesc();
	public DataResult<List<CandidateCV>> getActivityYearNull();
	public DataResult<CandidateCV> getById(int id);
}
