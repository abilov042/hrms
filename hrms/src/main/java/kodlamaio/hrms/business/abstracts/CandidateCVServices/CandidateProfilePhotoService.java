package kodlamaio.hrms.business.abstracts.CandidateCVServices;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.entities.concretes.candidateCV.CandidateProfilePhoto;

public interface CandidateProfilePhotoService {
	
	Result add(MultipartFile photo, int candidateCvId) throws IOException;
	DataResult<List<CandidateProfilePhoto>> getAll();

}
