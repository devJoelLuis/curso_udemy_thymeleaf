package br.com.home.project_thymeleaf.dao;

import java.util.List;

import br.com.home.project_thymeleaf.domain.Departamento;

public interface DepartamentoDao {

    void save(Departamento departamento);
    void update(Departamento departamento);
    void delete(Long id);
    Departamento findById(Long id);
    List<Departamento> findAll();

}
