package kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.candidateCV.CandidateProfilePhoto;

public interface CandidateProfilePhotoDao extends JpaRepository<CandidateProfilePhoto, Integer> {
	
}
