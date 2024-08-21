package com._tdspr.jhonatan.gateways;

import com._tdspr.jhonatan.domains.Aluno;
import com._tdspr.jhonatan.gateways.requests.AlunoPatchNome;
import com._tdspr.jhonatan.gateways.requests.AlunoPostRequest;
import com._tdspr.jhonatan.gateways.responses.AlunoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @GetMapping("/fiap")
    public ResponseEntity<String> getAlunos() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/fiap/{alunoId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<String> getAlunos(@PathVariable String alunoId) {
        return ResponseEntity.ok("Hello World o id é " + alunoId);
    }

    @PostMapping("/fiap")
    public ResponseEntity<AlunoResponse> postAluno(@RequestBody AlunoPostRequest aluno) {
        Aluno alunoAtualizado = new Aluno(aluno.primeiroNome(), aluno.sobrenome(), aluno.documento(), aluno.registro(), aluno.rm());

        AlunoResponse alunoResponse = AlunoResponse.builder()
            .primeiroNome(alunoAtualizado.getPrimeiroNome())
            .sobrenome(alunoAtualizado.getSobrenome())
            .documento(alunoAtualizado.getDocumento())
            .build();

        return ResponseEntity.ok(alunoResponse);

        /*Aluno alunoAtualizado = new Aluno();
        Aluno alunoAtualizado = new Aluno(aluno.primeiroNome(), aluno.sobrenome(),
            aluno.documento(), aluno.registro(), aluno.rm());*/

        /*alunoAtualizado.setPrimeiroNome(aluno.getPrimeiroNome());
        alunoAtualizado.setSobrenome(aluno.getSobrenome());
        alunoAtualizado.setDocumento(aluno.getDocumento());
        alunoAtualizado.setRegistro(aluno.getRegistro());

        return ResponseEntity.ok(alunoAtualizado);*/
    }

    @PatchMapping("/{alunoRm}/nome")
    public ResponseEntity<AlunoResponse> atualizaNome(@PathVariable String alunoRm, @RequestBody AlunoPatchNome nome){
        return
    }
}
