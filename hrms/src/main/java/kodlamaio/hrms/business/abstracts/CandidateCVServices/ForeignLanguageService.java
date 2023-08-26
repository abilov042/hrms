package kodlamaio.hrms.business.abstracts.CandidateCVServices;

import java.util.List;

import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.candidateCV.ForeignLanguage;

public interface ForeignLanguageService {
	public DataResult<List<ForeignLanguage>> getAll();
}
