package kodlamaio.hrms.business.concretes.candidateCVManagers;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.JobPositionService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.jobPosting.JobPosition;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JobPositionManager implements JobPositionService{
	
	
	private final JobPositionDao jobPositionDao;
	
	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>("Data geldi",this.jobPositionDao.findAll());
	}

}
