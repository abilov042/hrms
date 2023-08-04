package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.Candidate;

public interface VerificationCodeCandidateService {
	
	void createEmailVerificationCodeCandidate(Candidate candidate);

    void verifyEmail(int id, String code);
}
