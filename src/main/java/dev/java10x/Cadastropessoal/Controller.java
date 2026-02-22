package dev.java10x.Cadastropessoal;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class Controller {

    @GetMapping("/Boas Vindas")

    public String BoasVindas() {
        return  "Essa é a minha primeira mensagem nessa rota";
    }
}
