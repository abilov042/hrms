package kodlamaio.hrms.business.concretes;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.EmployerJobPostingService;
import kodlamaio.hrms.core.mappers.MapperService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerJobPostingDao;
import kodlamaio.hrms.entities.concretes.jobPosting.EmployerJobPosting;
import kodlamaio.hrms.entities.dtos.EmployerJobPostingDto;
import kodlamaio.hrms.entities.dtos.EmployerJobPostingWithCompanyDto;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployerJobPostingManager  implements EmployerJobPostingService{
	
	private EmployerJobPostingDao employerJobPostingDao;
	private MapperService mapperService;

	@Override
	public DataResult<EmployerJobPosting> getById(int id) {
		
		return new SuccessDataResult<EmployerJobPosting>("Is elani geldi", this.employerJobPostingDao.getById(id));
	}

	@Override
	public Result add(EmployerJobPosting employerJobPosting) {
		
		employerJobPosting.setPostingDate(new Date());
		this.employerJobPostingDao.save(employerJobPosting); 
		return new SuccessResult("Is elani yaradildi");
	}

	@Override
	public DataResult<List<EmployerJobPostingDto>> getAll() {
		List<EmployerJobPosting> employerJobPostings = employerJobPostingDao.findAll();
		List<EmployerJobPostingDto> employerJobPostingDtos = employerJobPostings.stream().map(employerJobPosting -> mapperService.getModelMapper().map(employerJobPosting, EmployerJobPostingDto.class)).collect(Collectors.toList());
		
		
		return new SuccessDataResult<List<EmployerJobPostingDto>>("Is elenlari geldi", employerJobPostingDtos);
	}
	
	@Override
	public DataResult<List<EmployerJobPostingDto>> getAllOrderBy() {
		List<EmployerJobPosting> employerJobPostings = employerJobPostingDao.getAllOrderByDate();
		List<EmployerJobPostingDto> employerJobPostingDtos = employerJobPostings.stream().map(employerJobPosting -> mapperService.getModelMapper().map(employerJobPosting, EmployerJobPostingDto.class)).collect(Collectors.toList());
		
		
		return new SuccessDataResult<List<EmployerJobPostingDto>>("Is elenlari geldi", employerJobPostingDtos);
	}
	
	@Override
	public DataResult<List<EmployerJobPostingDto>> getAllActive() {
		List<EmployerJobPosting> employerJobPostings = employerJobPostingDao.getAllActive();
		List<EmployerJobPostingDto> employerJobPostingDtos = employerJobPostings.stream().map(employerJobPosting -> mapperService.getModelMapper().map(employerJobPosting, EmployerJobPostingDto.class)).collect(Collectors.toList());
		
		
		return new SuccessDataResult<List<EmployerJobPostingDto>>("Is elenlari geldi", employerJobPostingDtos);
	}

	@Override
	public DataResult<List<EmployerJobPostingWithCompanyDto>> getEmployerJobPostingWithCompany(String companyName) {
		
		return new SuccessDataResult<List<EmployerJobPostingWithCompanyDto>>("Data geldi", this.employerJobPostingDao.getEmployerJobPostingWithCompany(companyName)); 
	}

	@Override
	public Result updateStatus(int employerJobPostingId) {
		EmployerJobPosting employerJobPosting = employerJobPostingDao.getById(employerJobPostingId);
		
		employerJobPosting.setStatus(false);
		
		this.employerJobPostingDao.save(employerJobPosting);
		
		return new SuccessResult("Status false oldu");
	}

}
