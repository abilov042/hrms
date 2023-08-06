package kodlamaio.hrms.entities.concretes.jobPosting;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "employer_job_postings")
public class EmployerJobPosting {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "min_salary")
	private int  minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "number_of_job_openings")
	private int numberOfJobOpenings;
	
	@Column(name = "posting_date")
	private Date postingDate;
	
	@Column(name = "status")
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	
}
