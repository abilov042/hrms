package kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.candidateCV.University;

public interface UniversityDao extends JpaRepository<University, Integer> {

}
