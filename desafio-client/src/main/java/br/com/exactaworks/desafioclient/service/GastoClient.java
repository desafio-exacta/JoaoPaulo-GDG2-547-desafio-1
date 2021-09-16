package br.com.exactaworks.desafioclient.service;

import br.com.exactaworks.desafioclient.dto.GastoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="GastoClient" ,url="${gasto.api.url}")
public interface GastoClient {

    @RequestMapping(method = RequestMethod.GET, value = "/{idGasto}")
    GastoDTO get(@PathVariable("idGasto") Long idGasto);

    @RequestMapping(method = RequestMethod.POST)
    GastoDTO post(@RequestBody GastoDTO body);

    @RequestMapping(method = RequestMethod.GET)
    List<GastoDTO> list();

}
