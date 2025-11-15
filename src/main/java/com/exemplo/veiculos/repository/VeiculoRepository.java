package com.exemplo.veiculos.repository;

import com.exemplo.veiculos.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findByMarcaNome(String nome);
    List<Veiculo> findByStatus(String status);
    List<Veiculo> findByAno(int ano);
    List<Veiculo> findByPrecoBetween(double min, double max);
}
