package br.com.home.project_thymeleaf.services;

import java.util.List;

import br.com.home.project_thymeleaf.domain.Departamento;

public interface DepartamentoInterface {
    void salvar(Departamento Departamento);
    void editar(Departamento Departamento);
    void excluir(Long id);
    Departamento buscarPorId(Long id);
    List<Departamento> buscarTodos();
}
