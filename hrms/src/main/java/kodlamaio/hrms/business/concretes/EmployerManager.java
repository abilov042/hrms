package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.mappers.MapperService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.ErrorResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.dtos.employerDto.EmployerDto;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployerManager implements EmployerService {
	
	private final EmployerDao employerDao;
	private final MapperService mapperService;
	
	

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>("Data geldi", this.employerDao.findAll());
	}

	@Override
	public Result add(EmployerDto employerDto) {
		if(!employerDto.getCPassword().equals(employerDto.getPassword())) {
			return new ErrorResult("Parola frkli");
		}
		Employer employer = mapperService.getModelMapper().map(employerDto, Employer.class);
		
		this.employerDao.save(employer);
		return new SuccessResult("Employer eklendi");
	}

}
