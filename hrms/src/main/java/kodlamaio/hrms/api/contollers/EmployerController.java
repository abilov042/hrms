package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.Employer;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employer")
@AllArgsConstructor
public class EmployerController {
	
	private final EmployerService employerService;
	
	
	@GetMapping("getAll")
	public DataResult<List<Employer>> getAll(){
		
		return this.employerService.getAll();
	}
}
