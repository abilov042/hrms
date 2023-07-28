package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employers")
public class Employer  {
	
	@Id
	@Column(name = "employer_id")
	private int employerId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web_adderss")
	private String webAddress;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
//	@OneToOne(mappedBy = "employer")
//	private VerificationCodeEmployer codeVerificationCodeEmployer;
}
