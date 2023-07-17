package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import kodlamaio.hrms.entities.abstracts.BaseUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidates")
//@PrimaryKeyJoinColumn(name = "user_id")

public class Candidate extends BaseUser {
	
//	@Id
	@Column(name = "candidate_id")
	private int userId;
	
	@Column(name = "identity_nuber", nullable = false, unique=true)
	private String identityNuber;
	
	@Column(name = "birth_of_year" , nullable = false)
	private String birthOfYear;
	 
//	@OneToOne(mappedBy = "candidate")
//	private BaseUser baseUser;
}
