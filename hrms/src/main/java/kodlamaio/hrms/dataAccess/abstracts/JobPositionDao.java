package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.entities.concretes.jobPosting.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
	JobPosition findById(int id);
}
