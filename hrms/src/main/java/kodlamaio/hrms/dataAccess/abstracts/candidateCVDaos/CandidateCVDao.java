package kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.candidateCV.CandidateCV;

public interface CandidateCVDao extends JpaRepository<CandidateCV, Integer> {
	
	@Query("SELECT cv FROM CandidateCV cv WHERE cv.endingDate IS NOT NULL ORDER BY cv.endingDate DESC")
	List<CandidateCV> getEndDateDesc();
	
	@Query("From CandidateCV where endingDate=null")
	List<CandidateCV> getEndDateNull();
	
	@Query("SELECT cv FROM CandidateCV cv WHERE cv.activityYear IS NOT 0 ORDER BY cv.endingJobPractice DESC")
	List<CandidateCV> getActivityYearDesc();
	
	@Query("FROM CandidateCV WHERE activityYear = 0")
	List<CandidateCV> getActivityYearNull();
}
