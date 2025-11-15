package com.exemplo.veiculos.controller;

import com.exemplo.veiculos.model.Veiculo;
import com.exemplo.veiculos.service.VeiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private final VeiculoService service;

    public VeiculoController(VeiculoService service) {
        this.service = service;
    }

    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo v) { return service.salvar(v); }

    @GetMapping
    public List<Veiculo> listar() { return service.listar(); }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.remover(id); }

    @PutMapping
    public Veiculo atualizar(@RequestBody Veiculo v) { return service.atualizar(v); }

    @GetMapping("/marca/{nome}")
    public List<Veiculo> porMarca(@PathVariable String nome) { return service.filtrarPorMarca(nome); }

    @GetMapping("/ano/{ano}")
    public List<Veiculo> porAno(@PathVariable int ano) { return service.filtrarPorAno(ano); }

    @GetMapping("/status/{status}")
    public List<Veiculo> porStatus(@PathVariable String status) { return service.filtrarPorStatus(status); }

    @GetMapping("/preco")
    public List<Veiculo> porPreco(@RequestParam double min, @RequestParam double max) {
        return service.filtrarPorPreco(min, max);
    }
}
