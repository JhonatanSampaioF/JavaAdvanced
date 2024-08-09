package usecases.impl;

import domains.Aluno;
import usecases.CadastrarAluno;

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
