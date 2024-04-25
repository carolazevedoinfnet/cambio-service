package br.edu.infnet.cambioservice.repository;

import br.edu.infnet.cambioservice.model.Cambio;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CambioRepository extends JpaRepository<Cambio, Long> {

    Cambio findByFromAndTo(String from, String to);

}