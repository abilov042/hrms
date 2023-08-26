package kodlamaio.hrms.api.contollers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.RemoteOrOnsideService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.entities.concretes.candidateCV.RemoteOrOnside;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/remoteOrOnside")
@CrossOrigin
@AllArgsConstructor
public class RemoteOrOnsideController {
	
	private final RemoteOrOnsideService remoteOrOnsideService;
	
	
	@GetMapping("/getall")
	public DataResult<List<RemoteOrOnside>> getAll(){
		
		return this.remoteOrOnsideService.getAll();
	}

}
