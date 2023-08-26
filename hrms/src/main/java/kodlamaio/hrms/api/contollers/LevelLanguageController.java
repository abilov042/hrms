package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.LevelLanguageService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.candidateCV.LevelLanguage;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/levelLanguage")
@CrossOrigin
@AllArgsConstructor
public class LevelLanguageController {
	
	private final LevelLanguageService levelLanguageService;
	
	@GetMapping("/getall")
	public DataResult<List<LevelLanguage>> getAll(){
		
		return this.levelLanguageService.getAll();
	}

}
