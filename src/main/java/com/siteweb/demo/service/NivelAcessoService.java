package com.siteweb.demo.service;

import com.siteweb.demo.model.NivelAcesso;
import com.siteweb.demo.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

    NivelAcessoRepository nivelAcessoRepository;

    @Autowired
    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository) {
        this.nivelAcessoRepository = nivelAcessoRepository;
    }

    public NivelAcesso saveNivel(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public List<NivelAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }


    public Optional<NivelAcesso> getById(Long idNivel) {
        return nivelAcessoRepository.findById(idNivel);
    }


    public NivelAcesso updateNivel(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public void deleteNivel(Long idNivel) {
        nivelAcessoRepository.deleteById(idNivel);
    }
}
