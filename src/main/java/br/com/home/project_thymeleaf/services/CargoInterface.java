package br.com.home.project_thymeleaf.services;

import java.util.List;

import br.com.home.project_thymeleaf.domain.Cargo;

public interface CargoInterface {

    void salvar(Cargo cargo);
    void editar(Cargo cargo);
    void excluir(Long id);
    Cargo buscarPorId(Long id);
    List<Cargo> buscarTodos();
    
}
