package kodlamaio.hrms.entities.concretes.verifications;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import kodlamaio.hrms.entities.concretes.Employer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "employee_confirm_Employers")
public class EmployeeConfirmEmployer {
	
	@Id
	@Column(name = "id")
	private int id;
	
	
	@OneToOne
	@JoinColumn(name = "id")
	private EmployeeConfirm employeeConfirm;
	
	@OneToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;
}
