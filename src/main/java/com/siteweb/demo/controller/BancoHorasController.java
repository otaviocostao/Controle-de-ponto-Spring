package com.siteweb.demo.controller;

import com.siteweb.demo.model.BancoHoras;
import com.siteweb.demo.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banco")
public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras createBanco(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.saveBanco(bancoHoras);
    }


    @GetMapping
    public List<BancoHoras> getBancoList(){
        return bancoHorasService.findAll();
    }

    @GetMapping("/{idBanco}")
    public ResponseEntity<BancoHoras> getBancoById(@PathVariable("idBanco") BancoHoras.BancoHorasId idBanco) throws Exception{
        return ResponseEntity.ok(bancoHorasService.getById(idBanco).orElseThrow(() -> new Exception("Banco de horas não encontrado")));

    }

    @PutMapping
    public BancoHoras updateBanco(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.updateBanco(bancoHoras);
    }

    @DeleteMapping("/{idBanco}")
    public ResponseEntity deleteById(@PathVariable("idBanco") BancoHoras.BancoHorasId idBanco) throws Exception{
        try {
            bancoHorasService.deleteCategoria(idBanco);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<BancoHoras>) ResponseEntity.ok();
    }
}
