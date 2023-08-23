package kodlamaio.hrms.entities.concretes.candidateCV;

import java.time.LocalDate;

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
@Table(name = "candidate_cvs")
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
	private LocalDate startingDate;
	
	@Column(name = "ending_date")
	private LocalDate endingDate;
	
	@ManyToOne
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;
	
	
	@Column(name = "starting_job_practice")
	private LocalDate stratingJobPractice;
	
	
	@Column(name = "ending_job_practice")
	private LocalDate endingJobPractice;
	
	@ManyToOne
	@JoinColumn(name = "foreign_language_id")
	private ForeignLanguage foreignLanguage;
	
	@ManyToOne
	@JoinColumn(name = "level_language_id")
	private LevelLanguage levelLanguage;
	
	@OneToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	@ManyToOne
	@JoinColumn(name = "program_language_id")
	private ProgramLanguage programLanguage;
	
	@Column(name = "git_hub_address")
	private String gitHubAddress;
	
	@Column(name = "linked_in_address")
	private String linkedInAddress;
	
	@Column(name = "activity_year")
	private int activityYear;
	
	

}
