package med.voll.Api.medico;

import med.voll.Api.endereco.DadosEndereco;

public record DadosCadastroMedicos(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
