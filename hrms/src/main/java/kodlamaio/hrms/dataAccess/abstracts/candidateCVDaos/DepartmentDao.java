package kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.candidateCV.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer>{

}
