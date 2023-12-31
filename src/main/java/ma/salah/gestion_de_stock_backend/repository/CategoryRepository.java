package ma.salah.gestion_de_stock_backend.repository;

import ma.salah.gestion_de_stock_backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

  Optional<Category> findCategoryByCode(String code);

}
