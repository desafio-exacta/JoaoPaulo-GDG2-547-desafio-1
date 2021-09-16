package br.com.exactaworks.desafioclient.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter @Setter
public class GastoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String nomePessoa;

    private String descricao;

    private LocalDateTime dataHora;

    private Double valor;

    private String tags;

}
