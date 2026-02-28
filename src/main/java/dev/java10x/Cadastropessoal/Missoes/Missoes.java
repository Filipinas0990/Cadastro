package dev.java10x.Cadastropessoal.Missoes;

import dev.java10x.Cadastropessoal.UsuariosControler.Model;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table (name = "tb_produto")

public class Missoes {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private BigDecimal preco;

    private String valor;

    private Integer  quantidade;

    @ManyToOne
    @JoinColumn(name = "missoes_id") // Chave estrangeira
    private Model nome;

    public Model getNome() {
        return nome;
    }

    public void setNome(Model nome) {
        this.nome = nome;
    }

    public Missoes () {

    }

    public Missoes(String nome, Integer quantidade, BigDecimal preco) {

        this.quantidade = quantidade;
        this.preco = preco;
    }



}

