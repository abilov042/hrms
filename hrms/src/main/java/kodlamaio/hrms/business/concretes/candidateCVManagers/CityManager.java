package kodlamaio.hrms.business.concretes.candidateCVManagers;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.CityService;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CityDao;
import kodlamaio.hrms.entities.concretes.jobPosting.City;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CityManager implements CityService {
	
	private final CityDao cityDao;

	@Override
	public DataResult<List<City>> getAll() {
		
		return new SuccessDataResult<List<City>>("City geldi", this.cityDao.findAll());
	}

}
