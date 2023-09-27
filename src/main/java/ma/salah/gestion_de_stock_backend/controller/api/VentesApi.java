package ma.salah.gestion_de_stock_backend.controller.api;

import ma.salah.gestion_de_stock_backend.dto.VentesDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static ma.salah.gestion_de_stock_backend.utils.Constants.VENTES_ENDPOINT;

public interface VentesApi {

  @PostMapping(VENTES_ENDPOINT + "/create")
  VentesDto save(@RequestBody VentesDto dto);

  @GetMapping(VENTES_ENDPOINT + "/{idVente}")
  VentesDto findById(@PathVariable("idVente") Integer id);

  @GetMapping(VENTES_ENDPOINT + "/{codeVente}")
  VentesDto findByCode(@PathVariable("codeVente") String code);

  @GetMapping(VENTES_ENDPOINT + "/all")
  List<VentesDto> findAll();

  @DeleteMapping(VENTES_ENDPOINT + "/delete/{idVente}")
  void delete(@PathVariable("idVente") Integer id);

}
