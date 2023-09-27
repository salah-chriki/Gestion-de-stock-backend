package ma.salah.gestion_de_stock_backend.validator;

import java.util.ArrayList;
import java.util.List;

import ma.salah.gestion_de_stock_backend.dto.CategoryDto;
import org.springframework.util.StringUtils;

public class CategoryValidator {

  public static List<String> validate(CategoryDto categoryDto) {
    List<String> errors = new ArrayList<>();

    if (categoryDto == null || !StringUtils.hasLength(categoryDto.getCode())) {
      errors.add("Veuillez renseigner le code de la categorie");
    }
    return errors;
  }

}
