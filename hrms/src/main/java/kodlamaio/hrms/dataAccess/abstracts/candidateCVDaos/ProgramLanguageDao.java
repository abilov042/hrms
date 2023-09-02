package kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.candidateCV.ProgramLanguage;

public interface ProgramLanguageDao extends JpaRepository<ProgramLanguage, Integer> {

}
