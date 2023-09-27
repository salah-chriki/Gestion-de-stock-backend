package ma.salah.gestion_de_stock_backend.controller.api;


import ma.salah.gestion_de_stock_backend.dto.ArticleDto;
import ma.salah.gestion_de_stock_backend.dto.LigneCommandeClientDto;
import ma.salah.gestion_de_stock_backend.dto.LigneCommandeFournisseurDto;
import ma.salah.gestion_de_stock_backend.dto.LigneVenteDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static ma.salah.gestion_de_stock_backend.utils.Constants.APP_ROOT;
public interface ArticleApi {

  @PostMapping(value = APP_ROOT + "/articles/create")
  ArticleDto save(@RequestBody ArticleDto dto);

  @GetMapping(value = APP_ROOT + "/articles/{idArticle}")
  ArticleDto findById(@PathVariable("idArticle") Integer id);

  @GetMapping(value = APP_ROOT + "/articles/filter/{codeArticle}")
  ArticleDto findByCodeArticle(@PathVariable("codeArticle") String codeArticle);

  @GetMapping(value = APP_ROOT + "/articles/all")
  List<ArticleDto> findAll();

  @GetMapping(value = APP_ROOT + "/articles/historique/vente/{idArticle}")
  List<LigneVenteDto> findHistoriqueVentes(@PathVariable("idArticle") Integer idArticle);

  @GetMapping(value = APP_ROOT + "/articles/historique/commandeclient/{idArticle}")
  List<LigneCommandeClientDto> findHistoriaueCommandeClient(@PathVariable("idArticle") Integer idArticle);

  @GetMapping(value = APP_ROOT + "/articles/historique/commandefournisseur/{idArticle}")
  List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(@PathVariable("idArticle") Integer idArticle);

  @GetMapping(value = APP_ROOT + "/articles/filter/category/{idCategory}")
  List<ArticleDto> findAllArticleByIdCategory(@PathVariable("idCategory") Integer idCategory);

  @DeleteMapping(value = APP_ROOT + "/articles/delete/{idArticle}")
  void delete(@PathVariable("idArticle") Integer id);

}
