package kodlamaio.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.VerificationCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Verification_code_employers")
public class VerificationCodeEmployer extends VerificationCode {
	
		
//		@Column(name = "employer_id")
//		private int employerId;
		
		@OneToOne
		@JoinColumn(name = "employer_id")
		private Employer employer;
}
