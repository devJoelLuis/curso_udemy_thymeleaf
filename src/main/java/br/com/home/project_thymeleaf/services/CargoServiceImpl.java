package br.com.home.project_thymeleaf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.home.project_thymeleaf.dao.CargoDao;
import br.com.home.project_thymeleaf.domain.Cargo;
import br.com.home.project_thymeleaf.repository.CargoRepository;

@Service 
public class CargoServiceImpl implements CargoInterface {

    @Autowired
    private CargoRepository repo;

    @Autowired
    private CargoDao dao;

    @Override
    @Transactional
    public void salvar(Cargo cargo) {
        dao.save(cargo);
        
    }

    @Override
    @Transactional
    public void editar(Cargo cargo) {
       dao.update(cargo);
        
    }

    @Override
    @Transactional
    public void excluir(Long id) {
       dao.delete(id);
        
    }

    @Override
    public Cargo buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Cargo> buscarTodos() {
       return dao.findAll();
    }

     // get by id
     public Cargo findById(Long id) {
        return repo.findById(id).orElse(null);
    }
    
    // find all
    public List<Cargo> findAll() {
        return repo.findAll();
    }

    // save and update
    @Transactional
    public Cargo saveAndUpdate(Cargo values) {
        Optional<Cargo> entityOp = repo.findById(values.getId());
        if (entityOp.isPresent()) {
            Cargo entityBanco = entityOp.get();
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
