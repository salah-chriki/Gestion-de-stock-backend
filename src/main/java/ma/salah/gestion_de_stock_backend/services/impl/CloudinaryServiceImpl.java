package ma.salah.gestion_de_stock_backend.services.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import lombok.SneakyThrows;
import ma.salah.gestion_de_stock_backend.services.CloudinaryService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
@Service
public class CloudinaryServiceImpl implements CloudinaryService {
    @Value("${cloudinary.cloudName}")
    private String cloudName;
    @Value("${cloudinary.apiKey}")
    private String apiKey;

    @Value("${cloudinary.apiSecret}")
    private String apiSecret;

    private Cloudinary cloudinary;
    @Override
//    @SneakyThrows
    public String savePhoto(MultipartFile multipartFile) throws IOException {
        connect();
        return cloudinary.uploader()
                .upload(multipartFile.getBytes(),Map.of("public_id", UUID.randomUUID().toString()))
                .get("url").toString();
    }



    private void connect() {
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", cloudName,
                "api_key", apiKey,
                "api_secret", apiSecret));
    }
}
