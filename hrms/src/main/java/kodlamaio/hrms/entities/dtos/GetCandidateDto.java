package kodlamaio.hrms.entities.dtos;

import lombok.Data;

@Data
public class GetCandidateDto {
	
	private int id;
	
	private String email;
	
	private String firstName;
	
	private String lastName;
	
	private String birthOfYear;

}
