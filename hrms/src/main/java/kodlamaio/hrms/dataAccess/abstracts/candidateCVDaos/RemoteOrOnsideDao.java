package kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.candidateCV.RemoteOrOnside;


public interface RemoteOrOnsideDao extends JpaRepository<RemoteOrOnside, Integer> {

}
