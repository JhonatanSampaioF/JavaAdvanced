package com._tdspr.jhonatan.domains;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@SuperBuilder
public class Aluno extends Pessoa {
    private String registro;
    private String rm;
    public Aluno(String primeiroNome, String sobrenome, String documento, String registro, String rm) {
        super(primeiroNome, sobrenome, documento);
        this.registro = registro;
    }
}


