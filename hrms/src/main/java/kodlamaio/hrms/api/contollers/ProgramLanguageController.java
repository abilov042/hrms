package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.ProgramLanguageService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.candidateCV.ProgramLanguage;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/programLanguage")
@CrossOrigin
@AllArgsConstructor
public class ProgramLanguageController {
	
	
	private final ProgramLanguageService programLanguageService;
	
	@GetMapping("/getall")
	public DataResult<List<ProgramLanguage>> getAll(){
		
		return this.programLanguageService.getAll();
	}

}
