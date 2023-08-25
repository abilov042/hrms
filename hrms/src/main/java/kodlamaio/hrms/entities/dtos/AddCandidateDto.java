package kodlamaio.hrms.entities.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddCandidateDto extends UserDto {
	
	
	
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
