package com.siteweb.demo.service;

import com.siteweb.demo.model.Movimentacao;
import com.siteweb.demo.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    MovimentacaoRepository movimentacaoRepository;

    @Autowired
    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    public Movimentacao saveMovimentacao(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public List<Movimentacao> findAll() {
        return movimentacaoRepository.findAll();
    }

    public Optional<Movimentacao> getById(Movimentacao.MovimentacaoID idMovimentacao) {
        return movimentacaoRepository.findById(idMovimentacao);
    }


    public Movimentacao updateMovimentacao(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public void deleteMovimentacao(Movimentacao.MovimentacaoID idMovimentacao) {
        movimentacaoRepository.deleteById(idMovimentacao);
    }
}
