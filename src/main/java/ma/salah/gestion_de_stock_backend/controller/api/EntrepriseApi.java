package ma.salah.gestion_de_stock_backend.controller.api;

import ma.salah.gestion_de_stock_backend.dto.EntrepriseDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static ma.salah.gestion_de_stock_backend.utils.Constants.ENTREPRISE_ENDPOINT;

public interface EntrepriseApi {

  @PostMapping(ENTREPRISE_ENDPOINT + "/create")
  EntrepriseDto save(@RequestBody EntrepriseDto dto);

  @GetMapping(ENTREPRISE_ENDPOINT + "/{idEntreprise}")
  EntrepriseDto findById(@PathVariable("idEntreprise") Integer id);

  @GetMapping(ENTREPRISE_ENDPOINT + "/all")
  List<EntrepriseDto> findAll();

  @DeleteMapping(ENTREPRISE_ENDPOINT + "/delete/{idEntreprise}")
  void delete(@PathVariable("idEntreprise") Integer id);

}
