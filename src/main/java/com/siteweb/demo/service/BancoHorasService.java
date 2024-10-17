package com.siteweb.demo.service;

import com.siteweb.demo.model.BancoHoras;
import com.siteweb.demo.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository) {
        this.bancoHorasRepository = bancoHorasRepository;
    }

    public BancoHoras saveBanco(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public List<BancoHoras> findAll() {
        return bancoHorasRepository.findAll();
    }

    public Optional<BancoHoras> getById(BancoHoras.BancoHorasId idBanco) {
        return bancoHorasRepository.findById(idBanco);
    }

    public BancoHoras updateBanco(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public void deleteCategoria(BancoHoras.BancoHorasId idBanco) {
        bancoHorasRepository.deleteById(idBanco);
    }
}
