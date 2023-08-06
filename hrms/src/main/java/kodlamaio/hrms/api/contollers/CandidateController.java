package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.dtos.AddCandidateDto;
import kodlamaio.hrms.entities.dtos.GetCandidateDto;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/candidates")
@AllArgsConstructor
public class CandidateController {
	
	private final CandidateService candidateService;
	
	
	@PostMapping("/save")
	public Result add(@RequestBody AddCandidateDto candidateDto) {
		
		return this.candidateService.add(candidateDto);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<GetCandidateDto>> getAll(){
		return this.candidateService.getAll();
	}
	
	@GetMapping("/getByBirthOfYear")
	public DataResult<List<Candidate>> getByBirthOfYear(String birthOfYear) {
		
		return this.candidateService.getByBirthOfYear(birthOfYear);
	}
	
	@GetMapping("/getByEmail")
	public DataResult<Candidate> getByEmail(String email) {
		
		return this.candidateService.getByEmail(email);
	}
	
	@GetMapping("/test")
	public void test(@RequestBody Candidate candidate) {
		
	}
	
}
