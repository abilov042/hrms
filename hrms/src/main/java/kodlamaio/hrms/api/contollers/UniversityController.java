package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.UniversityService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.candidateCV.University;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/universities")
@CrossOrigin
@AllArgsConstructor
public class UniversityController {
	
	private final UniversityService universityService;
	
	@GetMapping("/getAll")
	public DataResult<List<University>> getAll(){
		
		return this.universityService.getAll();
	}
	
}
