package com.siteweb.demo.controller;

import com.siteweb.demo.model.NivelAcesso;
import com.siteweb.demo.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nivelAcesso")
public class NivelAcessoController {

    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso createNivel(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.saveNivel(nivelAcesso);
    }


    @GetMapping
    public List<NivelAcesso> getNivelList(){
        return nivelAcessoService.findAll();
    }

    @GetMapping("/{idNivel}")
    public ResponseEntity<NivelAcesso> getNivelById(@PathVariable("idNivel") Long idNivel) throws Exception{
        return ResponseEntity.ok(nivelAcessoService.getById(idNivel).orElseThrow(() -> new Exception("Nivel de Acesso não encontrado")));
    }

    @PutMapping
    public NivelAcesso updateNivel(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.updateNivel(nivelAcesso);
    }

    @DeleteMapping("/{idNivel}")
    public ResponseEntity deleteById(@PathVariable("idNivel") Long idNivel) throws Exception{
        try {
            nivelAcessoService.deleteNivel(idNivel);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();
    }
}
