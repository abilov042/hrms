package kodlamaio.hrms.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import kodlamaio.hrms.entities.abstracts.BaseUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidates")
public class Candidate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "candidate_id")
	private int candidateId;
	
	@Column(name = "identity_number", nullable = false, unique=true)
	private String identityNumber;
	
	@Column(name = "birth_of_year" , nullable = false)
	private String birthOfYear;
	
	@OneToOne(mappedBy = "candidate", cascade = CascadeType.ALL)
	private VerificationCodeCandidate verificationCodeCandidate;
	
	@OneToOne(mappedBy = "candidate")
	private BaseUser baseUser;
}
