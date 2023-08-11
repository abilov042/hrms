package kodlamaio.hrms.api.contollers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.untilitues.result.ErrorDataResult;
import kodlamaio.hrms.entities.dtos.AddCandidateDto;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/candidates")
@AllArgsConstructor
public class CandidateController {
	
	private final CandidateService candidateService;
	
	
	@PostMapping("/save")
	public ResponseEntity<?> add(@RequestBody @Valid AddCandidateDto candidateDto) {
		
		return ResponseEntity.ok(this.candidateService.add(candidateDto));
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(this.candidateService.getAll());
	}
	
	@GetMapping("/getByBirthOfYear")
	public ResponseEntity<?> getByBirthOfYear(String birthOfYear) {
		
		return ResponseEntity.ok(this.candidateService.getByBirthOfYear(birthOfYear));
	}
	
	@GetMapping("/getByEmail")
	public ResponseEntity<?> getByEmail(String email) {
		
		return ResponseEntity.ok(this.candidateService.getByEmail(email));
	}
	
	
	
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		Map<String, String> validationErors = new HashMap<String,String>();
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		
		ErrorDataResult<Object> error = new ErrorDataResult<Object>("Error olusdu", validationErors);
		
		return error;
	}
	
}
