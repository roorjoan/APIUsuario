package com.roorjoan.api.usuario.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBaseService<E, ID extends Serializable> {

	public List<E> findAll() throws Exception;
    
	public Page<E> findAll(Pageable pageable) throws Exception;

	public E findById(ID id) throws Exception;

	public E save(E entity) throws Exception;

	public E update(ID id, E entity) throws Exception;

	public boolean delete(ID id) throws Exception;

}
