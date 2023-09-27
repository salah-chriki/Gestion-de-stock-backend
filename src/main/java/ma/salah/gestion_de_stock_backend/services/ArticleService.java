package ma.salah.gestion_de_stock_backend.services;


import ma.salah.gestion_de_stock_backend.dto.ArticleDto;
import ma.salah.gestion_de_stock_backend.dto.LigneCommandeClientDto;
import ma.salah.gestion_de_stock_backend.dto.LigneCommandeFournisseurDto;
import ma.salah.gestion_de_stock_backend.dto.LigneVenteDto;

import java.util.List;

public interface ArticleService {

  ArticleDto save(ArticleDto dto);

  ArticleDto findById(Integer id);

  ArticleDto findByCodeArticle(String codeArticle);

  List<ArticleDto> findAll();

  List<LigneVenteDto> findHistoriqueVentes(Integer idArticle);

  List<LigneCommandeClientDto> findHistoriaueCommandeClient(Integer idArticle);

  List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(Integer idArticle);

  List<ArticleDto> findAllArticleByIdCategory(Integer idCategory);

  void delete(Integer id);

}
