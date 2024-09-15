package med.voll.Api.controller;

import jakarta.validation.Valid;
import med.voll.Api.medico.DadosCadastroMedicos;
import med.voll.Api.medico.DadosListagemMedico;
import med.voll.Api.medico.Medico;
import med.voll.Api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedicos dados){

        repository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(@PageableDefault(size = 2, sort = {"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }
}
