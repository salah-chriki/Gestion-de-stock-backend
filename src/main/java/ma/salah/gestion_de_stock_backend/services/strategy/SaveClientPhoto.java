package ma.salah.gestion_de_stock_backend.services.strategy;

import lombok.extern.slf4j.Slf4j;
import ma.salah.gestion_de_stock_backend.dto.ClientDto;
import ma.salah.gestion_de_stock_backend.exception.ErrorCodes;
import ma.salah.gestion_de_stock_backend.exception.InvalidOperationException;
import ma.salah.gestion_de_stock_backend.services.ClientService;
import ma.salah.gestion_de_stock_backend.services.CloudinaryService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service("clientStrategy")
@Slf4j
public class SaveClientPhoto implements Strategy<ClientDto> {

    private CloudinaryService cloudinaryService;
    private ClientService clientService;

    public SaveClientPhoto(CloudinaryService cloudinaryService, ClientService clientService) {
        this.cloudinaryService = cloudinaryService;
        this.clientService = clientService;
    }


    @Override
    public ClientDto savePhoto(Integer id, MultipartFile photo, String titre) throws IOException {
        ClientDto client = clientService.findById(id);
        String urlPhoto = cloudinaryService.savePhoto(photo);
        if (!StringUtils.hasLength(urlPhoto)) {
            throw new InvalidOperationException("Erreur lors de l'enregistrement de photo du client", ErrorCodes.UPDATE_PHOTO_EXCEPTION);
        }
        client.setPhoto(urlPhoto);
        return clientService.save(client);
    }
}
