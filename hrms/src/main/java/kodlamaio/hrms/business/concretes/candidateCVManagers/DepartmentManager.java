package kodlamaio.hrms.business.concretes.candidateCVManagers;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.DepartmentService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos.DepartmentDao;
import kodlamaio.hrms.entities.concretes.candidateCV.Department;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentManager implements DepartmentService {
	
	private final DepartmentDao departmentDao;
	
	@Override
	public DataResult<List<Department>> getAll() {
		
		return new SuccessDataResult<List<Department>>("Departmentler geldi",this.departmentDao.findAll());
	}

}
