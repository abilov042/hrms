package kodlamaio.hrms.business.concretes.candidateCVManagers;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.UniversityService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos.UniversityDao;
import kodlamaio.hrms.entities.concretes.candidateCV.University;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UniversityManager implements UniversityService {
	
	private final UniversityDao universityDao;
	
	@Override
	public DataResult<List<University>> getAll() {
		
		return new SuccessDataResult<List<University>>("University geldi", this.universityDao.findAll()) ;
	}

}
