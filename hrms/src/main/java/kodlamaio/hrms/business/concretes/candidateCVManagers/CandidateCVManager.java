package kodlamaio.hrms.business.concretes.candidateCVManagers;

import java.time.LocalDate;
import java.time.Period;
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
		Period duration = Period.between(candidateCV.getStratingJobPractice(),(candidateCV.getEndingJobPractice()==null)? LocalDate.now() :candidateCV.getEndingJobPractice());
		candidateCV.setActivityYear(duration.getYears());
		this.candidateCVDao.save(candidateCV);
		return new SuccessResult("save olundu");
		
	}

	@Override
	public DataResult<List<CandidateCV>> getAll() {
		
		return new SuccessDataResult<List<CandidateCV>>("CV listelendi", this.candidateCVDao.findAll());
	}

	@Override
	public DataResult<List<CandidateCV>> getEndDateDesc() {
		
		return new SuccessDataResult<List<CandidateCV>>("Data geldi", this.candidateCVDao.getEndDateDesc()); 
	}

	@Override
	public DataResult<List<CandidateCV>> getEndDateNull() {
		
		return new SuccessDataResult<List<CandidateCV>>("Data geldi", this.candidateCVDao.getEndDateNull());
	}

	@Override
	public DataResult<List<CandidateCV>> getActivityYearDesc() {
		
		return new SuccessDataResult<List<CandidateCV>>("Data geldi",this.candidateCVDao.getActivityYearDesc());
	}

	@Override
	public DataResult<List<CandidateCV>> getActivityYearNull() {
		
		return new SuccessDataResult<List<CandidateCV>>("Data geldi",this.candidateCVDao.getActivityYearNull()); 
	}

	@Override
	public DataResult<CandidateCV> getById(int id) {
		
		return new SuccessDataResult<CandidateCV>("Data geldi" ,this.candidateCVDao.findById(id).orElseThrow());
	}

}
