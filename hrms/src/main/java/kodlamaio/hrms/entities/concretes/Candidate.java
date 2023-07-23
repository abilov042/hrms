package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Candidate extends BaseUser {
	
//	@Column(name = "user_id")
//	private int userId;
	
	@Column(name = "identity_nuber", nullable = false, unique=true)
	private String identityNuber;
	
	@Column(name = "birth_of_year" , nullable = false)
	private String birthOfYear; 
	
	
	@OneToOne(mappedBy = "candidate")
	private VerificationCodeCandidate verificationCodeCandidate;
	 
	
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="candidate_id", referencedColumnName = "id")
//	private BaseUser baseUser;
}
