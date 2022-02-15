package br.com.home.project_thymeleaf.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento extends AbstractEntity<Long> {

    @Column(name="nome", nullable = false, unique = true, length = 60)
    private String nome;

}
