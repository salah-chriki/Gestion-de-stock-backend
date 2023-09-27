package ma.salah.gestion_de_stock_backend.services;

import ma.salah.gestion_de_stock_backend.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

  CategoryDto save(CategoryDto dto);

  CategoryDto findById(Integer id);

  CategoryDto findByCode(String code);

  List<CategoryDto> findAll();

  void delete(Integer id);

}
