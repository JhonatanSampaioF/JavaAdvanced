package usecases.impl;

import com._tdspr.jhonatan.domains.Aluno;
import com._tdspr.jhonatan.usecases.impl.CadastrarAlunoImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com._tdspr.jhonatan.usecases.CadastrarAluno;

class CadastrarAlunoImplTest {

    CadastrarAluno cadastrarAluno = new CadastrarAlunoImpl();

    @Test
    @DisplayName("Testa se as infos do objeto alunoASerCadastrado foram devidamente copiadas para um novo objeto")
    void testExecutaDeCadastrarAluno(){
        // dado uma condicao, Arrange
        Aluno alunoASerCadastrado = new Aluno();
        alunoASerCadastrado.setPrimeiroNome("Jhonatan");
        alunoASerCadastrado.setSobrenome("Sampaio");
        alunoASerCadastrado.setRegistro("xx.xxx.xxx-x");
        alunoASerCadastrado.setDocumento("xxxxxx");
        // quando algo acontecer, Act
        Aluno cadastrado = cadastrarAluno.executar(alunoASerCadastrado);
        // entao verifique uma determinada info, Assert
        Assertions.assertEquals(alunoASerCadastrado.getPrimeiroNome(), cadastrado.getPrimeiroNome(),"Deve copiar o primeiro nome de um objeto aluno");
        Assertions.assertEquals(alunoASerCadastrado.getSobrenome(),cadastrado.getSobrenome(),"Deve copiar o primeiro nome de um objeto aluno");
        Assertions.assertEquals(alunoASerCadastrado.getRegistro(),cadastrado.getRegistro(),"Deve copiar o registro de um objeto aluno");
        Assertions.assertEquals(alunoASerCadastrado.getDocumento(),cadastrado.getDocumento(),"Deve copiar o documento de um objeto aluno");

    }

}