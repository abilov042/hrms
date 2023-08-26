package kodlamaio.hrms.business.abstracts.CandidateCVServices;

import java.util.List;

import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.candidateCV.RemoteOrOnside;

public interface RemoteOrOnsideService {
	public DataResult<List<RemoteOrOnside>> getAll();
}
