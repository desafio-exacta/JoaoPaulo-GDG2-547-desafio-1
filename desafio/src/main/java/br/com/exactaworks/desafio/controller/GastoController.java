package br.com.exactaworks.desafio.controller;

import br.com.exactaworks.desafio.model.Gasto;
import br.com.exactaworks.desafio.service.GastoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/gastos")
public class GastoController {

    private final GastoService gastoService;

    @GetMapping
    public List<Gasto> list(){
        return gastoService.listarTodos();
    }

    @GetMapping("{id}")
    public Gasto recuperar(@PathVariable Long id) {
        return gastoService.recuperar(id);
    }

    @PostMapping
    public Gasto salvar(@RequestBody Gasto gasto) {
        return gastoService.salvar(gasto);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable Long id) {
        gastoService.deletar(id);
    }

}
