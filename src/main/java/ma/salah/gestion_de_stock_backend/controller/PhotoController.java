package ma.salah.gestion_de_stock_backend.controller;

import ma.salah.gestion_de_stock_backend.controller.api.PhotoApi;
import ma.salah.gestion_de_stock_backend.services.strategy.StrategyPhotoContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class PhotoController implements PhotoApi {

  private StrategyPhotoContext strategyPhotoContext;

  @Autowired
  public PhotoController(StrategyPhotoContext strategyPhotoContext) {
    this.strategyPhotoContext = strategyPhotoContext;
  }

  @Override
  public Object savePhoto(String context, Integer id, MultipartFile photo, String title) throws IOException {
    return strategyPhotoContext.savePhoto(context, id, photo, title);
  }
}
