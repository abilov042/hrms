package kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.candidateCV.CandidateCV;

public interface CandidateCVDao extends JpaRepository<CandidateCV, Integer> {
	
	

}
