package com.exemplo.veiculos.controller;

import com.exemplo.veiculos.model.Marca;
import com.exemplo.veiculos.service.MarcaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    private final MarcaService service;

    public MarcaController(MarcaService service) {
        this.service = service;
    }

    @PostMapping
    public Marca salvar(@RequestBody Marca m) { return service.salvar(m); }

    @GetMapping
    public List<Marca> listar() { return service.listar(); }
}
