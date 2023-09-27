package ma.salah.gestion_de_stock_backend.services.strategy;

import lombok.extern.slf4j.Slf4j;
import ma.salah.gestion_de_stock_backend.dto.UtilisateurDto;
import ma.salah.gestion_de_stock_backend.exception.ErrorCodes;
import ma.salah.gestion_de_stock_backend.exception.InvalidOperationException;
import ma.salah.gestion_de_stock_backend.services.CloudinaryService;
import ma.salah.gestion_de_stock_backend.services.UtilisateurService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service("utilisateurStrategy")
@Slf4j
public class SaveUtilisateurPhoto implements Strategy<UtilisateurDto> {

  private CloudinaryService cloudinaryService;
  private UtilisateurService utilisateurService;

  public SaveUtilisateurPhoto(CloudinaryService cloudinaryService, UtilisateurService utilisateurService) {
    this.cloudinaryService = cloudinaryService;
    this.utilisateurService = utilisateurService;
  }


  @Override
  public UtilisateurDto savePhoto(Integer id, MultipartFile photo, String titre) throws IOException {
    UtilisateurDto utilisateur = utilisateurService.findById(id);
    String urlPhoto = cloudinaryService.savePhoto(photo);
    if (!StringUtils.hasLength(urlPhoto)) {
      throw new InvalidOperationException("Erreur lors de l'enregistrement de photo de l'utilisateur", ErrorCodes.UPDATE_PHOTO_EXCEPTION);
    }
    utilisateur.setPhoto(urlPhoto);
    return utilisateurService.save(utilisateur);
  }
}
