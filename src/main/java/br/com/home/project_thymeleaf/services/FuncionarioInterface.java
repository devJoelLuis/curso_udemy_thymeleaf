package br.com.home.project_thymeleaf.services;

import java.util.List;

import br.com.home.project_thymeleaf.domain.Funcionario;

public interface FuncionarioInterface {
    void salvar(Funcionario Funcionario);
    void editar(Funcionario Funcionario);
    void excluir(Long id);
    Funcionario buscarPorId(Long id);
    List<Funcionario> buscarTodos();
}
