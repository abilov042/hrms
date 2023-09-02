package kodlamaio.hrms.business.concretes.candidateCVManagers;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.ProgramLanguageService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos.ProgramLanguageDao;
import kodlamaio.hrms.entities.concretes.candidateCV.ProgramLanguage;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProgramLanguageManager implements ProgramLanguageService{
	
	private final ProgramLanguageDao programLanguageDao;

	@Override
	public DataResult<List<ProgramLanguage>> getAll() {
		
		return new SuccessDataResult<List<ProgramLanguage>>("Data geldi", this.programLanguageDao.findAll());
	}
	
	

}
