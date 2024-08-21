package com._tdspr.jhonatan.usecases.impl;

import com._tdspr.jhonatan.usecases.CadastrarAluno;
import com._tdspr.jhonatan.domains.Aluno;

public class CadastrarAlunoImpl implements CadastrarAluno {
    @Override
    public Aluno executar(Aluno alunoParaSerCadastrado) {
        Aluno cadastrado = new Aluno();
        cadastrado.setPrimeiroNome(alunoParaSerCadastrado.getPrimeiroNome());
        cadastrado.setSobrenome(alunoParaSerCadastrado.getSobrenome());
        cadastrado.setRegistro(alunoParaSerCadastrado.getRegistro());
        cadastrado.setDocumento(alunoParaSerCadastrado.getDocumento());
        return cadastrado;
    }
}
