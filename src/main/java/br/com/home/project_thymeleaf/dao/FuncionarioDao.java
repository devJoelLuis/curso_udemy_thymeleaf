package br.com.home.project_thymeleaf.dao;

import java.util.List;

import br.com.home.project_thymeleaf.domain.Funcionario;

public interface FuncionarioDao {

    void save(Funcionario Funcionario);
    void update(Funcionario Funcionario);
    void delete(Long id);
    Funcionario findById(Long id);
    List<Funcionario> findAll();

}
