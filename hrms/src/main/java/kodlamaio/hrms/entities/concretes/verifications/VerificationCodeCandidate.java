package kodlamaio.hrms.entities.concretes.verifications;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.VerificationCode;
import kodlamaio.hrms.entities.concretes.Candidate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "verification_code_candidates")
public class VerificationCodeCandidate extends VerificationCode{
	
	

	
	@OneToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
} 
