package br.com.home.project_thymeleaf.domain;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;
    
}
