package kodlamaio.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.VerificationCode;
import lombok.Getter;
import lombok.Setter;

@Entity
//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@Table(name = "verification_code_candidates")
public class VerificationCodeCandidate extends VerificationCode{
	
	
//	@Id
//	@Column(name = "verification_code_id", nullable = false)
//	private int verificationCodeId;
	
//	@OneToOne
//	@JoinColumn(name = "id")
//	private VerificationCode verificationCode;
	
	@OneToOne
	@JoinColumn(name = " candidate_id")
	private Candidate candidate;
} 
