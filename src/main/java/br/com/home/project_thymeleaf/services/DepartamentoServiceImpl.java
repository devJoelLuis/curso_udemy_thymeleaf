package br.com.home.project_thymeleaf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.home.project_thymeleaf.dao.DepartamentoDao;
import br.com.home.project_thymeleaf.domain.Departamento;
import br.com.home.project_thymeleaf.repository.DepartamentoRepository;

@Service
public class DepartamentoServiceImpl implements DepartamentoInterface {

    @Autowired
    private DepartamentoRepository repo;

    @Autowired
    private DepartamentoDao dao;


    @Override
    @Transactional
    public void salvar(Departamento departamento) {
        dao.save(departamento);
        
    }

    @Override
    @Transactional
    public void editar(Departamento departamento) {
       dao.update(departamento);
        
    }

    @Override
    @Transactional
    public void excluir(Long id) {
       dao.delete(id);
        
    }

    @Override
    public Departamento buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Departamento> buscarTodos() {
       return dao.findAll();
    }

    // get by id
    public Departamento findById(Long id) {
        return repo.findById(id).orElse(null);
    }
    
    // find all
    public List<Departamento> findAll() {
        return repo.findAll();
    }

    // save and update
    public Departamento saveAndUpdate(Departamento values) {
        Optional<Departamento> entityOp = repo.findById(values.getId());
        if (entityOp.isPresent()) {
            Departamento entityBanco = entityOp.get();
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
