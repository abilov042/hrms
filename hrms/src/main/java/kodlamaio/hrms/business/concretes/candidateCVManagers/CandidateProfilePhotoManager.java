package kodlamaio.hrms.business.concretes.candidateCVManagers;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.business.abstracts.CandidateCVServices.CandidateProfilePhotoService;
import kodlamaio.hrms.core.cloudinary.CloudinaryConfigration;
import kodlamaio.hrms.core.untilitues.result.DataResult;
import kodlamaio.hrms.core.untilitues.result.Result;
import kodlamaio.hrms.core.untilitues.result.SuccessDataResult;
import kodlamaio.hrms.core.untilitues.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos.CandidateCVDao;
import kodlamaio.hrms.dataAccess.abstracts.candidateCVDaos.CandidateProfilePhotoDao;
import kodlamaio.hrms.entities.concretes.candidateCV.CandidateCV;
import kodlamaio.hrms.entities.concretes.candidateCV.CandidateProfilePhoto;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CandidateProfilePhotoManager implements CandidateProfilePhotoService{
	
	private CandidateProfilePhotoDao candidateProfilePhotoDao;
	private CloudinaryConfigration cloudinaryConfigration;
	private CandidateCVDao candidateCVDao;
	
	public Result add(MultipartFile photo, int candidateCvId) throws IOException {
		
		Map uploadResult = cloudinaryConfigration.cloudinary().uploader().upload(photo.getBytes(), ObjectUtils.emptyMap());
		CandidateProfilePhoto candidateProfilePhoto = new CandidateProfilePhoto();
		candidateProfilePhoto.setPhotoURL(String.valueOf(uploadResult.get("url")));
		CandidateCV candidateCV = candidateCVDao.findById(candidateCvId).orElseThrow();  // error line
		candidateProfilePhoto.setCandidateCV(candidateCV);
		this.candidateProfilePhotoDao.save(candidateProfilePhoto);
		return new SuccessResult("Profil sekli yerlesdirildi"); 
	}

	@Override
	public DataResult<List<CandidateProfilePhoto>> getAll() {
		
		return new SuccessDataResult<List<CandidateProfilePhoto>>("Fotolar geldi", this.candidateProfilePhotoDao.findAll());
	}

}
