package kodlamaio.hrms.business.concretes;

import java.util.List;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeManager implements EmployeeService {
	
	private EmployeeDao employeeDao;
	

	@Override
	public DataResult<List<Employee>> getAll() {
		
		return new SuccessDataResult<List<Employee>>("Listelendi", this.employeeDao.findAll());
	}
	
	

}
