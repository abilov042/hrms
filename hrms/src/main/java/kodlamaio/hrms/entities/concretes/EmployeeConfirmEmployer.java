package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "employee_confirm_Employer")
public class EmployeeConfirmEmployer {
	
	@Id
	@Column(name = "id")
	private int id;
	
//	@Column(name = "employer_id")
//	private int employerId;
	
	@OneToOne
	@JoinColumn(name = "id")
	private EmployeeConfirm employeeConfirm;
	
	@OneToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;
}
