package ma.salah.gestion_de_stock_backend.services;

import ma.salah.gestion_de_stock_backend.dto.FournisseurDto;

import java.util.List;

public interface FournisseurService {

  FournisseurDto save(FournisseurDto dto);

  FournisseurDto findById(Integer id);

  List<FournisseurDto> findAll();

  void delete(Integer id);

}
