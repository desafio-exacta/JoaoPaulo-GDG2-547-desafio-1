package br.com.exactaworks.desafio.service;

import br.com.exactaworks.desafio.model.Gasto;
import br.com.exactaworks.desafio.repository.GastoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GastoService {

    private final GastoRepository gastoRepository;

    public List<Gasto> listarTodos() {
        return gastoRepository.findAll();
    }

    public Gasto recuperar(Long id) {
        return gastoRepository.findById(id).orElse(null);
    }

    public Gasto salvar(Gasto gasto) {
        return gastoRepository.save(gasto);
    }

    public void deletar(Long id) {
        gastoRepository.deleteById(id);
    }


}
