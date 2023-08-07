package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerJobPostingService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CityDao;
import kodlamaio.hrms.dataAccess.abstracts.EmployerJobPostingDao;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.jobPosting.City;
import kodlamaio.hrms.entities.concretes.jobPosting.EmployerJobPosting;
import kodlamaio.hrms.entities.concretes.jobPosting.JobPosition;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployerJobPostingManager  implements EmployerJobPostingService{
	
	private EmployerJobPostingDao employerJobPostingDao;
	private JobPositionDao jobPositionDao;
	private CityDao cityDao;

	@Override
	public DataResult<EmployerJobPosting> getById(int id) {
		
		return new SuccessDataResult<EmployerJobPosting>("Is elani geldi", this.employerJobPostingDao.getById(id));
	}

	@Override
	public DataResult<EmployerJobPosting> add(EmployerJobPosting employerJobPosting) {
		City city = cityDao.findById(employerJobPosting.getCity().getId());
		JobPosition jobPosition = jobPositionDao.findById(employerJobPosting.getJobPosition().getId());
		employerJobPosting.setCity(city);
		employerJobPosting.setJobPosition(jobPosition);
		return new SuccessDataResult<EmployerJobPosting>("Is elani yaradildi", this.employerJobPostingDao.save(employerJobPosting));
	}

	@Override
	public DataResult<List<EmployerJobPosting>> getAll() {
		
		return new SuccessDataResult<List<EmployerJobPosting>>("Is elenlari geldi", this.employerJobPostingDao.findAll());
	}

}
