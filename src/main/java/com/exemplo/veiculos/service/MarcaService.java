package com.exemplo.veiculos.service;

import com.exemplo.veiculos.model.Marca;
import com.exemplo.veiculos.repository.MarcaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MarcaService {

    private final MarcaRepository repo;

    public MarcaService(MarcaRepository repo) {
        this.repo = repo;
    }

    public Marca salvar(Marca m) { return repo.save(m); }
    public List<Marca> listar() { return repo.findAll(); }
}
