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
import kodlamaio.hrms.business.abstracts.EmployerJobPostingService;
import kodlamaio.hrms.core.untilitues.result.ErrorDataResult;
import kodlamaio.hrms.entities.concretes.jobPosting.EmployerJobPosting;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employerJobPostings")
@AllArgsConstructor
public class EmployerJobPostingController {
	
	
	private EmployerJobPostingService employerJobPostingService;
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody EmployerJobPosting employerJobPosting){
		
		return ResponseEntity.ok(this.employerJobPostingService.add(employerJobPosting));
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		
		return ResponseEntity.ok(this.employerJobPostingService.getAll());
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
