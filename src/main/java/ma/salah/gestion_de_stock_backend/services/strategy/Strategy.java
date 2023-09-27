package ma.salah.gestion_de_stock_backend.services.strategy;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface Strategy<T> {

  T savePhoto(Integer id, MultipartFile photo, String titre) throws IOException;

}
