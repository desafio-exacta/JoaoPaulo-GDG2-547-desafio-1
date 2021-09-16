package br.com.exactaworks.desafio.repository;

import br.com.exactaworks.desafio.model.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GastoRepository extends JpaRepository<Gasto, Long> {
}
