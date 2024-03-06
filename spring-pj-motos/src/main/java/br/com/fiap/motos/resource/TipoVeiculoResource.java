package br.com.fiap.motos.resource;

import br.com.fiap.motos.entity.TipoVeiculo;
import br.com.fiap.motos.repository.TipoDeVeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/TipoVeiculoResource")
public class TipoVeiculoResource {

    @Autowired
    TipoDeVeiculoRepository repo;

    @GetMapping
    public List<TipoVeiculo> findAll() {return repo.findAll();}

    @GetMapping(value = "/{id}")
    public TipoVeiculo findAll(@PathVariable("id") Long id) {
        var ret = repo.findById(id);
        return ret.get();
    }

    @PostMapping("/TipoDeVeiculo")
    public TipoVeiculo savePost(@RequestBody TipoVeiculo requestBody) {
        var save = repo.save(requestBody);
        return save;
    }


}
