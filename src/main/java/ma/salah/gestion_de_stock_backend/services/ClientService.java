package ma.salah.gestion_de_stock_backend.services;

import ma.salah.gestion_de_stock_backend.dto.ClientDto;

import java.util.List;

public interface ClientService {

  ClientDto save(ClientDto dto);

  ClientDto findById(Integer id);

  List<ClientDto> findAll();

  void delete(Integer id);

}
