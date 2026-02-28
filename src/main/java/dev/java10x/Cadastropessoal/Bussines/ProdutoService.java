package dev.java10x.Cadastropessoal.Bussines;

import dev.java10x.Cadastropessoal.Missoes.Missoes;
import dev.java10x.Cadastropessoal.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Missoes salvar(Missoes produto) {

        if (produto.getQuantidade() != null && produto.getQuantidade() < 0) {
            throw new RuntimeException("Quantidade não pode ser negativa");
        }

        if (produto.getPreco() != null && produto.getPreco().doubleValue() < 0) {
            throw new RuntimeException("Preço não pode ser negativo");
        }

        return repository.save(produto);
    }

    public List<Missoes> listar() {
        return repository.findAll();
    }

    public Missoes buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public Missoes atualizar(Long id, Missoes novoProduto) {

        Missoes existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        existente.setValor(novoProduto.getValor());
        existente.setPreco(novoProduto.getPreco());
        existente.setQuantidade(novoProduto.getQuantidade());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}