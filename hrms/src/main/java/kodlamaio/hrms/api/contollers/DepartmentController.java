package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.DepartmentService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.candidateCV.Department;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/departments")
@CrossOrigin
@AllArgsConstructor
public class DepartmentController {
	
	private final DepartmentService departmentServic;
	
	@GetMapping("/getall")
	public DataResult<List<Department>> getAll(){
		
		return this.departmentServic.getAll();
	}

}
