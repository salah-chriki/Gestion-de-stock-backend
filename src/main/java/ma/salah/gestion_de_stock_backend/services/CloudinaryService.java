package ma.salah.gestion_de_stock_backend.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

public interface CloudinaryService {
    String savePhoto(MultipartFile multipartFile) throws IOException;
}
