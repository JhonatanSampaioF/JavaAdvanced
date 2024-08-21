package com._tdspr.jhonatan.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@SuperBuilder
public class Aluno extends Pessoa {
    private String registro;
    @JsonIgnore
    private String id;
    public Aluno(String primeiroNome, String sobrenome, String documento, String registro) {
        super(primeiroNome, sobrenome, documento);
        this.registro = registro;
    }
}


