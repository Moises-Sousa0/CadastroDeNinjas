package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasvindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

    @GetMapping("/ninjas")
    public String ninjas(){
        return "DATTEBAYO WOOOOSH";
    }

    @GetMapping("/idade")
    public String idade(){
        return "Tenho 20 anos";
    }

    @GetMapping("/ninjaModelo")
    public NinjaModel ninja(){
        NinjaModel ninja = new NinjaModel(1l, "dani", "dan1", 22);
        return ninja;
    }
}
