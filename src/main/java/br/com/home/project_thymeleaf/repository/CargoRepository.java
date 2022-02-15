package br.com.home.project_thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.home.project_thymeleaf.domain.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    
}
