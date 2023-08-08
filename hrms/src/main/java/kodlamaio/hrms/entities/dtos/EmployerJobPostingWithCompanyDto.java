package kodlamaio.hrms.entities.dtos;
//Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class EmployerJobPostingWithCompanyDto {
	
	private String companyName;
	private String jobPositionName;
	private int numberOfJobOpenings;
	private Date postingDate;
	private Date deatline;
	
}
