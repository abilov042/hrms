package kodlamaio.hrms.business.abstracts.CandidateCVServices;

import java.util.List;

import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.candidateCV.ProgramLanguage;

public interface ProgramLanguageService {
	public DataResult<List<ProgramLanguage>> getAll();

}
