package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.dtos.AddCandidateDto;
import kodlamaio.hrms.entities.dtos.GetCandidateDto;

public interface CandidateService {
	public Result add(AddCandidateDto candidateDto);
	public DataResult<List<GetCandidateDto>> getAll();
	public DataResult<List<Candidate>> getByBirthOfYear(String birthOfYear);
	public DataResult<Candidate> getByEmail(String email);
}
