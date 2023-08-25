package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.dtos.employerDto.EmployerDto;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employer")
@AllArgsConstructor
@CrossOrigin
public class EmployerController {
	
	private final EmployerService employerService;
	
	@PostMapping("/add")
	public Result add(@RequestBody EmployerDto employerDto) {
		
		return this.employerService.add(employerDto);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Employer>> getAll(){
		
		return this.employerService.getAll();
	}
}
