package kodlamaio.hrms.business.concretes.candidateCVManagers;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.RemoteOrOnsideService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos.RemoteOrOnsideDao;
import kodlamaio.hrms.entities.concretes.candidateCV.RemoteOrOnside;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RemoteOrOnsideManager implements RemoteOrOnsideService {
	
	private final RemoteOrOnsideDao remoteOrOnsideDao;

	@Override
	public DataResult<List<RemoteOrOnside>> getAll() {
		
		return new SuccessDataResult<List<RemoteOrOnside>>("Data geldi", this.remoteOrOnsideDao.findAll());
	}
	
	
	

}
