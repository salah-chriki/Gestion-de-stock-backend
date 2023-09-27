package ma.salah.gestion_de_stock_backend.services.strategy;

import ma.salah.gestion_de_stock_backend.dto.ArticleDto;
import ma.salah.gestion_de_stock_backend.exception.ErrorCodes;
import ma.salah.gestion_de_stock_backend.exception.InvalidOperationException;
import ma.salah.gestion_de_stock_backend.services.ArticleService;

import java.io.IOException;
import java.io.InputStream;
import lombok.extern.slf4j.Slf4j;
import ma.salah.gestion_de_stock_backend.services.CloudinaryService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service("articleStrategy")
@Slf4j
public class SaveArticlePhoto implements Strategy<ArticleDto> {

  private CloudinaryService cloudinaryService;
  private ArticleService articleService;

  public SaveArticlePhoto(CloudinaryService cloudinaryService, ArticleService articleService) {
    this.cloudinaryService = cloudinaryService;
    this.articleService = articleService;
  }


  @Override
  public ArticleDto savePhoto(Integer id, MultipartFile photo, String titre) throws IOException {
    ArticleDto article = articleService.findById(id);
    String urlPhoto = cloudinaryService.savePhoto(photo);
    if (!StringUtils.hasLength(urlPhoto)) {
      throw new InvalidOperationException("Erreur lors de l'enregistrement de photo de l'article", ErrorCodes.UPDATE_PHOTO_EXCEPTION);
    }
    article.setPhoto(urlPhoto);
    return articleService.save(article);
  }
}
