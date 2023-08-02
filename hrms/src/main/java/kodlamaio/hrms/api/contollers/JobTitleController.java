package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobTitle")
public class JobTitleController {
	
	private final JobTitleService jobTitleService;
	
	@Autowired
	public JobTitleController(JobTitleService jobTitleService) {
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobTitle>> getAll(){
		
		return this.jobTitleService.getAll();
	}
}
