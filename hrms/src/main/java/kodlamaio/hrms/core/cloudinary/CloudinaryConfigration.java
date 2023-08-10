package kodlamaio.hrms.core.cloudinary;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudinaryConfigration {
    private final String CLOUD_NAME = "dh4x0nd4s";
    private final String API_KEY = "681674249256191";
    private final String API_SECRET = "b68hAFGZZs2W-x-cP4f0SCHU6G4";
    @Bean
    public Cloudinary cloudinary(){
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name",CLOUD_NAME);
        config.put("api_key",API_KEY);
        config.put("api_secret",API_SECRET);

        return new Cloudinary(config);
    }
}