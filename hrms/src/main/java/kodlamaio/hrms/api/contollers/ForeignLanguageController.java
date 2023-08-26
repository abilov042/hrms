package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.ForeignLanguageService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.candidateCV.ForeignLanguage;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/foreignLanguage")
@CrossOrigin
@AllArgsConstructor
public class ForeignLanguageController {
	
	private final ForeignLanguageService foreignLanguageService;
	
	
	@GetMapping("/getall")
	public DataResult<List<ForeignLanguage>> getAll(){
		
		return this.foreignLanguageService.getAll();
	}

}
