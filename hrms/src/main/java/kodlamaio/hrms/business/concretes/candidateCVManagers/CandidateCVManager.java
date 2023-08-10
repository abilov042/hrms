package kodlamaio.hrms.business.concretes.candidateCVManagers;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.CandidateCVService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos.CandidateCVDao;
import kodlamaio.hrms.entities.concretes.candidateCV.CandidateCV;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CandidateCVManager implements CandidateCVService {
	
	private final CandidateCVDao candidateCVDao;

	@Override
	public Result add(CandidateCV candidateCV) {
		this.candidateCVDao.save(candidateCV);
		return new SuccessResult("save olundu");
	}

	@Override
	public DataResult<List<CandidateCV>> getAll() {
		
		return new SuccessDataResult<List<CandidateCV>>("CV listelendi", this.candidateCVDao.findAll());
	}

}
