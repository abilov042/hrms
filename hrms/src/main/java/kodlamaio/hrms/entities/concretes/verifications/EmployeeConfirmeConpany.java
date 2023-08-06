package kodlamaio.hrms.entities.concretes.verifications;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import kodlamaio.hrms.entities.concretes.Company;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "employee_confirme_conpanies")
public class EmployeeConfirmeConpany {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "id")
	private EmployeeConfirm employeeConfirm;
	
	@OneToOne
	@JoinColumn(name = "company_id")
	private Company company;

}
