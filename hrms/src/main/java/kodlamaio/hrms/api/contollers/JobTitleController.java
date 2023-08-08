package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.JobTitle;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/jobTitle")
@AllArgsConstructor
public class JobTitleController {
	
	private final JobTitleService jobTitleService;
	
	
	@GetMapping("/getAll")
	public DataResult<List<JobTitle>> getAll(){
		
		return this.jobTitleService.getAll();
	}
}
