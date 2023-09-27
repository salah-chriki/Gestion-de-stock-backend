package ma.salah.gestion_de_stock_backend.services.strategy;

import lombok.extern.slf4j.Slf4j;
import ma.salah.gestion_de_stock_backend.dto.FournisseurDto;
import ma.salah.gestion_de_stock_backend.exception.ErrorCodes;
import ma.salah.gestion_de_stock_backend.exception.InvalidOperationException;
import ma.salah.gestion_de_stock_backend.services.CloudinaryService;
import ma.salah.gestion_de_stock_backend.services.FournisseurService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service("fournisseurStrategy")
@Slf4j
public class SaveFournisseurPhoto implements Strategy<FournisseurDto> {

  private CloudinaryService cloudinaryService;
  private FournisseurService fournisseurService;

  public SaveFournisseurPhoto(CloudinaryService cloudinaryService, FournisseurService fournisseurService) {
    this.cloudinaryService = cloudinaryService;
    this.fournisseurService = fournisseurService;
  }


  @Override
  public FournisseurDto savePhoto(Integer id, MultipartFile photo, String titre) throws IOException {
    FournisseurDto fournisseur = fournisseurService.findById(id);
    String urlPhoto = cloudinaryService.savePhoto(photo);
    if (!StringUtils.hasLength(urlPhoto)) {
      throw new InvalidOperationException("Erreur lors de l'enregistrement de photo du fournisseur", ErrorCodes.UPDATE_PHOTO_EXCEPTION);
    }
    fournisseur.setPhoto(urlPhoto);
    return fournisseurService.save(fournisseur);
  }
}
