package br.com.exactaworks.desafioclient.component;

import br.com.exactaworks.desafioclient.dto.GastoDTO;
import br.com.exactaworks.desafioclient.service.GastoClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Slf4j
@Component
public class GastoClientService {

    @Autowired
    GastoClient gastoClient;

    @PostConstruct
    public void executarClient() {

        GastoDTO dto = new GastoDTO();
        dto.setNomePessoa("Nome Completo");
        dto.setDescricao("Descrição do gasto");
        dto.setValor(130.26D);
        dto.setTags("Tag1, Tag2, Tag3");
        dto.setDataHora(LocalDateTime.now());

        dto = gastoClient.post(dto);
        log.info("####### Gasto salvo com sucesso. ID: " + dto.getId());


        log.info("####### Listando Todos os gastos");
        log.info(gastoClient.list().size() + " registros retornados pela API");


        log.info("####### Recuperando pelo ID: " + dto.getId());
        GastoDTO dtoRecuperado = gastoClient.get(dto.getId());
        log.info("Gasto Recuperado: " + dtoRecuperado.getNomePessoa() + " | Valor: " + dtoRecuperado.getValor());

    }

}
