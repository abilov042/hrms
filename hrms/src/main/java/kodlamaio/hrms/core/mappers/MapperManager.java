package kodlamaio.hrms.core.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;


@Service
public class MapperManager implements MapperService {
	
	
	@Override
	public ModelMapper getModelMapper() {
		ModelMapper  mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return mapper;
	}

}
