package kodlamaio.hrms.business.concretes;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.VerificationCodeCandidateService;
import kodlamaio.hrms.dataAccess.abstracts.VerificationCodeCandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.verifications.VerificationCodeCandidate;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VerificationCodeCandidateManager implements VerificationCodeCandidateService {
	
	private final VerificationCodeCandidateDao verificationCodeCandidateDao;
	

	@Override
	public void createEmailVerificationCodeCandidate(Candidate candidate) {
		String code = generateCode();
		VerificationCodeCandidate verificationCodeCandidate = new VerificationCodeCandidate();
		verificationCodeCandidate.setCandidate(candidate);
		verificationCodeCandidate.setCode(code);
		verificationCodeCandidateDao.save(verificationCodeCandidate);
		
		
		
	}

	@Override
	public void verifyEmail(int id, String code) {
		VerificationCodeCandidate verificationCodeCandidate = verificationCodeCandidateDao.getById(id);
		
		verificationCodeCandidate.setConfirmeDate(new Date());
		verificationCodeCandidate.setVerified(true);
		verificationCodeCandidateDao.save(verificationCodeCandidate);
	}
	
	public String generateCode() {
		Random random = new Random();
		
		return  String.valueOf(random.nextInt(100000,999999));
	}
	

}
