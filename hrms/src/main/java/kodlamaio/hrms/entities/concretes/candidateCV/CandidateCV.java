package kodlamaio.hrms.entities.concretes.candidateCV;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.jobPosting.JobPosition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "candidate_CVs")
public class CandidateCV {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "school_name")
	private University school;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	@Column(name = "starting_date")
	private Date startingDate;
	
	@Column(name = "ending_date")
	private Date endingDate;
	
	@ManyToOne
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;
	
	@Column(name = "starting_job_practice")
	private Date stratingJobPractice;
	
	@Column(name = "ending_job_practice")
	private Date endingJobPractice;
	
	@ManyToOne
	@JoinColumn(name = "foreign_language_id")
	private ForeignLanguage foreignLanguage;
	
	@ManyToOne
	@JoinColumn(name = "level_language_id")
	private LevelLanguage levelLanguage;
	
	@OneToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;

}
