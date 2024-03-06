package br.com.fiap.motos.resource;

import br.com.fiap.motos.entity.Veiculo;
import br.com.fiap.motos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/veiculo")
public class VeiculoResource {
    @Autowired
    private VeiculoRepository repo;

    @GetMapping
    public List<Veiculo> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Veiculo findById(@PathVariable("id") Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping
    public Veiculo salvarVeiculo(@RequestBody Veiculo requestBody) {
        return repo.save(requestBody);
    }
}
