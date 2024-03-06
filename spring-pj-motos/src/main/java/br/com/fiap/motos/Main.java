package br.com.fiap.motos;

import br.com.fiap.motos.entity.Veiculo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    //Test
    //Veiculo carro1 = new Veiculo(1, "Camaro", "Preta", 22.000, (short)50);

    @GetMapping(value = "/")
    public String index() {
        return "Api Motos, adicione algum endereço à URL";
    }
}
