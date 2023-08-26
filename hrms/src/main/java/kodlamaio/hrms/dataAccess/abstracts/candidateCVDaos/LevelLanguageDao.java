package kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.candidateCV.LevelLanguage;

public interface LevelLanguageDao extends JpaRepository<LevelLanguage, Integer>{

}
