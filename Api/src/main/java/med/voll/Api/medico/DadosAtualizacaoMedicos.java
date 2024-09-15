package med.voll.Api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.Api.endereco.DadosEndereco;

public record DadosAtualizacaoMedicos(
        @NotNull
        Long id,

        String Nome,

        String telefone,

        DadosEndereco endereco) {
}
