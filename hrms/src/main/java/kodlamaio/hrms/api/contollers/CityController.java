package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.CityService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.jobPosting.City;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/city")
@CrossOrigin
@AllArgsConstructor
public class CityController {
	
	private final CityService cityService;
	
	@GetMapping("/getAll")
	public DataResult<List<City>> getAll(){
		
		return this.cityService.getAll();
	}

}
