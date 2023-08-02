package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {
	
	private CandidateService candidateService;
	
	@Autowired
	public CandidateController(CandidateService candidateService) {
		this.candidateService = candidateService;
	}
	
	@PostMapping("/save")
	public Result add(@RequestBody Candidate candidate) {
		
		 return this.candidateService.add(candidate);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Candidate>> getAll(){
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
	
}
