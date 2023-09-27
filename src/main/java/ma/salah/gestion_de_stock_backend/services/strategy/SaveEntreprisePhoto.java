package ma.salah.gestion_de_stock_backend.services.strategy;

import lombok.extern.slf4j.Slf4j;
import ma.salah.gestion_de_stock_backend.dto.EntrepriseDto;
import ma.salah.gestion_de_stock_backend.exception.ErrorCodes;
import ma.salah.gestion_de_stock_backend.exception.InvalidOperationException;
import ma.salah.gestion_de_stock_backend.services.CloudinaryService;
import ma.salah.gestion_de_stock_backend.services.EntrepriseService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service("entrepriseStrategy")
@Slf4j
public class SaveEntreprisePhoto implements Strategy<EntrepriseDto> {

    private CloudinaryService cloudinaryService;
    private EntrepriseService entrepriseService;

    public SaveEntreprisePhoto(CloudinaryService cloudinaryService, EntrepriseService entrepriseService) {
        this.cloudinaryService = cloudinaryService;
        this.entrepriseService = entrepriseService;
    }


    @Override
    public EntrepriseDto savePhoto(Integer id, MultipartFile photo, String titre) throws IOException {
        EntrepriseDto entreprise = entrepriseService.findById(id);
        String urlPhoto = cloudinaryService.savePhoto(photo);
        if (!StringUtils.hasLength(urlPhoto)) {
            throw new InvalidOperationException("Erreur lors de l'enregistrement de photo de l'entreprise", ErrorCodes.UPDATE_PHOTO_EXCEPTION);
        }
        entreprise.setPhoto(urlPhoto);
        return entrepriseService.save(entreprise);
    }
}
