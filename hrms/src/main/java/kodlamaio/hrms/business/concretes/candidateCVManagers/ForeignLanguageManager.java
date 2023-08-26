package kodlamaio.hrms.business.concretes.candidateCVManagers;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.ForeignLanguageService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos.ForeignLanguageDao;
import kodlamaio.hrms.entities.concretes.candidateCV.ForeignLanguage;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ForeignLanguageManager implements ForeignLanguageService {
	
	private final ForeignLanguageDao foreignLanguageDao;

	@Override
	public DataResult<List<ForeignLanguage>> getAll() {
		
		return new SuccessDataResult<List<ForeignLanguage>>("Langauge geldi", this.foreignLanguageDao.findAll());
	}

}
