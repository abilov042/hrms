package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.abstracts.VerificationCodeCandidateService;
import kodlamaio.hrms.core.mappers.MapperService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.ErrorResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.dtos.AddCandidateDto;
import kodlamaio.hrms.entities.dtos.GetCandidateDto;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CandidateManager implements CandidateService {
	
	private final CandidateDao candidateDao;
	private final VerificationCodeCandidateService verificationCodeCandidateService;
	private final MapperService mapperService;
	
	

	@Override
	public Result add(AddCandidateDto candidateDto) {
		Candidate candidate = mapperService.getModelMapper().map(candidateDto, Candidate.class);
		if(!candidateDto.getCPassword().equals(candidateDto.getPassword()))
			return new ErrorResult("Parolalar farkli");
		
		this.candidateDao.save(candidate);
		this.verificationCodeCandidateService.createEmailVerificationCodeCandidate(candidate);
		
		return new SuccessResult("Email e code geldi");
	}

	@Override
	public DataResult<List<GetCandidateDto>> getAll() {
		List<Candidate> candidates = candidateDao.findAll();
		List<GetCandidateDto> getCandidateDto = candidates.stream().map(candidate -> mapperService.getModelMapper().map(candidate, GetCandidateDto.class)).collect(Collectors.toList());
		
		return new SuccessDataResult<List<GetCandidateDto>>("Data listelendi" ,getCandidateDto);
	}
	
	
	@Override
	public DataResult<List<Candidate>> getByBirthOfYear(String birthOfYear) { 
		
		return new SuccessDataResult<List<Candidate>>("Data listelendi" ,candidateDao.getByBirthOfYear(birthOfYear));
	}

	@Override
	public DataResult<Candidate> getByEmail(String email) {
		
		return new SuccessDataResult<Candidate>("Geldi",this.candidateDao.getByE(email));
	}
	
	

}
