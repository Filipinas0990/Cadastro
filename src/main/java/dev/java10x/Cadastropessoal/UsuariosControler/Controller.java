package dev.java10x.Cadastropessoal.UsuariosControler;

import dev.java10x.Cadastropessoal.Missoes.Missoes;
import dev.java10x.Cadastropessoal.Bussines.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class Controller {

    private final ProdutoService service;

    public Controller(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public Missoes criar(@RequestBody Missoes produto) {
        return service.salvar(produto);
    }

    @GetMapping
    public List<Missoes> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Missoes buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Missoes atualizar(@PathVariable Long id, @RequestBody Missoes produtoAtualizado) {
        return service.atualizar(id, produtoAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}