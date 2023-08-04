package kodlamaio.hrms.entities.dtos;

import lombok.Data;

@Data
public class GetCandidateDto {
	
	private String email;
	 
	private String password;
	
	private String firstName;
	
	private String lastName;

	private String identityNumber;
	
	private String birthOfYear;

}
