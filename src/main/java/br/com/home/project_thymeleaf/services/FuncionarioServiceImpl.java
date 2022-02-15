package br.com.home.project_thymeleaf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.home.project_thymeleaf.dao.FuncionarioDao;
import br.com.home.project_thymeleaf.domain.Funcionario;
import br.com.home.project_thymeleaf.repository.FuncionarioRepository;

@Service
public class FuncionarioServiceImpl implements FuncionarioInterface {

    @Autowired
    private FuncionarioRepository repo;

    @Autowired
    private FuncionarioDao dao;

    @Override
    @Transactional
    public void salvar(Funcionario funcionario) {
        dao.save(funcionario);
        
    }

    @Override
    @Transactional
    public void editar(Funcionario funcionario) {
       dao.update(funcionario);
        
    }

    @Override
    @Transactional
    public void excluir(Long id) {
       dao.delete(id);
        
    }

    @Override
    public Funcionario buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Funcionario> buscarTodos() {
       return dao.findAll();
    }

    // get by id
    public Funcionario findById(Long id) {
        return repo.findById(id).orElse(null);
    }
    
    // find all
    public List<Funcionario> findAll() {
        return repo.findAll();
    }

    // save and update
    public Funcionario saveAndUpdate(Funcionario values) {
        Optional<Funcionario> entityOp = repo.findById(values.getId());
        if (entityOp.isPresent()) {
            Funcionario entityBanco = entityOp.get();
            BeanUtils.copyProperties(values, entityBanco, "id");
            return repo.save(entityBanco);
        } 
        return repo.save(values);
    }

    // delete
    public void delete(Long id) {
        repo.deleteById(id);
    }

    
}
