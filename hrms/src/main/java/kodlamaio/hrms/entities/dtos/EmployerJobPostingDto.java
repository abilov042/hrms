package kodlamaio.hrms.entities.dtos;

import java.util.Date;
import kodlamaio.hrms.entities.concretes.Company;
import kodlamaio.hrms.entities.concretes.jobPosting.JobPosition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerJobPostingDto {
	
	
	private int numberOfJobOpenings;
	
	private Date postingDate;
	
	private Date deadline;
	
	private JobPosition jobPosition;
	
	private Company company;
	
	
	
}
