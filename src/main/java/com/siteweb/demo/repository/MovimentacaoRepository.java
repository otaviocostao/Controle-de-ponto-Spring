package com.siteweb.demo.repository;

import com.siteweb.demo.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Movimentacao.MovimentacaoID> {
}