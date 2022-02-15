package br.com.home.project_thymeleaf.dao;

import java.util.List;

import br.com.home.project_thymeleaf.domain.Cargo;

public interface CargoDao {

    void save(Cargo Cargo);
    void update(Cargo Cargo);
    void delete(Long id);
    Cargo findById(Long id);
    List<Cargo> findAll();

}
