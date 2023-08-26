package kodlamaio.hrms.business.concretes.candidateCVManagers;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.LevelLanguageService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos.LevelLanguageDao;
import kodlamaio.hrms.entities.concretes.candidateCV.LevelLanguage;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LevelLanguageManager implements LevelLanguageService {
	
	private final LevelLanguageDao levelLanguageDao;
	
	@Override
	public DataResult<List<LevelLanguage>> getAll() {
		
		return new SuccessDataResult<List<LevelLanguage>>("Level geldi", this.levelLanguageDao.findAll());
	}

}
