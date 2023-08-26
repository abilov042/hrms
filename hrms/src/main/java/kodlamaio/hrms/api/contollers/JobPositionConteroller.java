package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.JobPositionService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.jobPosting.JobPosition;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/jobPosition")
@CrossOrigin
@AllArgsConstructor
public class JobPositionConteroller {
	
	private final JobPositionService jobPositionService;
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		
		return this.jobPositionService.getAll();
	}

}
