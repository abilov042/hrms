package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
	
	@NotBlank
	@NotNull
	@Column(name = "first_name", nullable = false) 
	private String firstName;
	
	@NotBlank
	@NotNull
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@NotBlank
	@NotNull
	@Column(name = "identity_number", nullable = false, unique=true)
	private String identityNumber;
	
	@NotBlank
	@NotNull
	@Column(name = "birth_of_year" , nullable = false)
	private String birthOfYear;
	
}
