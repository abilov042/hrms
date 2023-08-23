package kodlamaio.hrms.entities.dtos.employerDto;



import kodlamaio.hrms.entities.concretes.Company;
import kodlamaio.hrms.entities.dtos.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployerDto extends UserDto {
	
	
	
	private String webAddress;
	private String phoneNumber;
}
