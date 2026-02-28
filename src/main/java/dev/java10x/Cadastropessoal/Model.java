package dev.java10x.Cadastropessoal;

import jakarta.persistence.*;

// Entity ele transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
     private long id;
     private String nome;
      private  String email;
     private int idade;

    public Model() {
    }

    public Model(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
// Feito por Filipe Oliveira! Para você que está lendo meu código, NÂO DESISTA !
/* João 16:33
 "Eu disse essas coisas para que em mim vocês tenham paz. Neste mundo vocês terão aflições; contudo, tenham ânimo! Eu venci o mundo".*/