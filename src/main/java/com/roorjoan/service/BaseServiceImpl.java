package com.roorjoan.service;

import java.io.Serializable;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import com.roorjoan.repository.IBaseRepository;

public abstract class BaseServiceImpl<E, ID extends Serializable> implements IBaseService<E, ID> {

	@Autowired
	protected IBaseRepository<E, ID> baseRepository;

	@Override
	@Transactional
	public List<E> findAll() throws Exception {
		try {
			return baseRepository.findAll();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public E findById(ID id) throws Exception {
		try {
			return baseRepository.findById(id).get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public E save(E entity) throws Exception {
		try {
			return baseRepository.save(entity);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public E update(ID id, E entity) throws Exception {
		try {
			E entityTemp = baseRepository.findById(id).get();
			entityTemp = baseRepository.save(entity);
			return entityTemp;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(ID id) throws Exception {
		try {
			baseRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
