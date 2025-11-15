package com.exemplo.veiculos.service;

import com.exemplo.veiculos.model.Veiculo;
import com.exemplo.veiculos.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    private final VeiculoRepository repo;

    public VeiculoService(VeiculoRepository repo) {
        this.repo = repo;
    }

    public Veiculo salvar(Veiculo v) { return repo.save(v); }
    public List<Veiculo> listar() { return repo.findAll(); }
    public void remover(Long id) { repo.deleteById(id); }
    public Veiculo atualizar(Veiculo v) { return repo.save(v); }

    public List<Veiculo> filtrarPorMarca(String nome) { return repo.findByMarcaNome(nome); }
    public List<Veiculo> filtrarPorAno(int ano) { return repo.findByAno(ano); }
    public List<Veiculo> filtrarPorStatus(String status) { return repo.findByStatus(status); }
    public List<Veiculo> filtrarPorPreco(double min, double max) { return repo.findByPrecoBetween(min, max); }
}
