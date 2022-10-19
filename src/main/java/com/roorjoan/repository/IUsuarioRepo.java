package com.roorjoan.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.roorjoan.entity.Usuario;

@Repository
public interface IUsuarioRepo extends IBaseRepository<Usuario, Integer> {

	@Query(value = "select * from tb_usuario as u where u.usuario like %:filtro%", 
			countQuery = "select count(*) from tb_usuario", 
			nativeQuery = true)
	Page<Usuario> buscarNombreUsuario(@Param("filtro") String filtro, Pageable pageable);
}
