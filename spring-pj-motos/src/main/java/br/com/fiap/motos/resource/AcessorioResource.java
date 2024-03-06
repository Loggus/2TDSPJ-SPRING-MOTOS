package br.com.fiap.motos.resource;

import br.com.fiap.motos.entity.Acessorio;
import br.com.fiap.motos.entity.Veiculo;
import br.com.fiap.motos.repository.AcessorioRepository;
import br.com.fiap.motos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/acessorio")
public class AcessorioResource {

    @Autowired
    private AcessorioRepository repo;

    @GetMapping
    public List<Acessorio> findAll() {return repo.findAll();}

    @GetMapping(value = "/{id}")
    public Acessorio findAll(@PathVariable("id") Long id) {
        var ret = repo.findById(id);
        return ret.get();
    }

    @PostMapping("/acessorio")
    public Acessorio salvarAcessorio(@RequestBody Acessorio requestBody) {
        var saveAcessorio = repo.save(requestBody);
        return saveAcessorio;
    }


}
