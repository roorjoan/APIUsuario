package com.roorjoan.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IBaseRepository<E, ID extends Serializable> extends JpaRepository<E, ID> {
}
