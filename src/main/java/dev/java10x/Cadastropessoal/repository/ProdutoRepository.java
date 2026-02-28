package dev.java10x.Cadastropessoal.repository;

import dev.java10x.Cadastropessoal.Missoes.Missoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Missoes, Long> {
}