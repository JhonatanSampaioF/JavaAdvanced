package domains;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Aluno extends Pessoa {
    private String rm;
    @JsonProperty("registry")
    private String registro;
}
