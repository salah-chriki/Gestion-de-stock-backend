package ma.salah.gestion_de_stock_backend.services;

import ma.salah.gestion_de_stock_backend.dto.ChangerMotDePasseUtilisateurDto;
import ma.salah.gestion_de_stock_backend.dto.UtilisateurDto;

import java.util.List;

public interface UtilisateurService {

  UtilisateurDto save(UtilisateurDto dto);

  UtilisateurDto findById(Integer id);

  List<UtilisateurDto> findAll();

  void delete(Integer id);

  UtilisateurDto findByEmail(String email);

  UtilisateurDto changerMotDePasse(ChangerMotDePasseUtilisateurDto dto);


}
