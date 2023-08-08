package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.Employee;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/empoyees")
@AllArgsConstructor
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	
	@GetMapping("/getAll")
	public DataResult<List<Employee>> getAll(){
		
		return this.employeeService.getAll();
	}
}
