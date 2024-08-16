package gateways;

import domains.Aluno;
import gateways.requests.AlunoPostRequest;
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
    public void getAlunos(@PathVariable String alunoId) {
//        return new Aluno();
    }

    @PostMapping("/fiap")
    public ResponseEntity<Aluno> postAluno(@RequestBody AlunoPostRequest aluno) {
//        Aluno alunoAtualizado = Aluno.builder()
//            .registro(aluno.getRegistro())
//            .build();
//        Aluno alunoAtualizado = new Aluno();
        Aluno alunoAtualizado = new Aluno(aluno.primeiroNome(), aluno.sobrenome(),
            aluno.documento(), aluno.registro());
//        alunoAtualizado.setPrimeiroNome(aluno.getPrimeiroNome());
//        alunoAtualizado.setSobrenome(aluno.getSobrenome());
//        alunoAtualizado.setDocumento(aluno.getDocumento());
//        alunoAtualizado.setRegistro(aluno.getRegistro());
        return ResponseEntity.ok(alunoAtualizado);
    }
}
