package kodlamaio.hrms.entities.concretes.verifications;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import kodlamaio.hrms.entities.concretes.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "employee_confirms")
public class EmployeeConfirm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
//	@Column(name = "employee_id")
//	private int employeeId;
	
	@Column(name = "is_confirm")
	private boolean isConfirm;
	
	@Column(name = "confirm_date")
	private Date confirmDate;
	
	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@OneToOne(mappedBy = "employeeConfirm")
	private EmployeeConfirmEmployer employeeConfirmEmployer;
	

	@OneToOne(mappedBy = "employeeConfirm")
	private EmployeeConfirmeConpany employeeConfirmeConpany;
	
	

}
