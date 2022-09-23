package com.educacionIT.JDBC;

import java.util.List;

public interface DAO<E,K> {

	E buscarPorClavePrimaria(K k); // String Integer

	boolean guardar(E e);

	boolean eliminar(E e);

	List<E> listar();

}
