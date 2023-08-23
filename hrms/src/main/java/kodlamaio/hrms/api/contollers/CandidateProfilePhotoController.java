package kodlamaio.hrms.api.contollers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.CandidateProfilePhotoService;
import kodlamaio.hrms.core.untilitues.result.ErrorDataResult;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/candidateProfilePhotoControllers")
@CrossOrigin
@AllArgsConstructor
public class CandidateProfilePhotoController {
	
	private CandidateProfilePhotoService candidateProfilePhotoService;
	
	@PostMapping("/save")
	ResponseEntity<?> add(MultipartFile photo, int candidateCvId) throws IOException{
		
		return ResponseEntity.ok(this.candidateProfilePhotoService.add(photo, candidateCvId));
	}
	
	@GetMapping("/getAll")
	ResponseEntity<?> getAll(){
		
		return ResponseEntity.ok(this.candidateProfilePhotoService.getAll());
	}
	
	@GetMapping("/getByCandidateId")
	ResponseEntity<?> getByCandidateId(int id){
		
		return ResponseEntity.ok(this.candidateProfilePhotoService.getBycandidateCVId(id));
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
