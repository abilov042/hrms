package kodlamaio.hrms.entities.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AddCandidateDto {
	
	private String email;
	 
	private String password;
	
	private String cPassword;
	
	@NotBlank
	@NotNull
	private String firstName;
	
	@NotBlank
	@NotNull
	private String lastName;
	
	@NotBlank
	@NotNull
	private String identityNumber;
	
	@NotBlank
	@NotNull
	private String birthOfYear;

}
