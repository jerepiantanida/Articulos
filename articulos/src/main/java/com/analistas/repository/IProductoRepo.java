/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.repository;

import com.analistas.entities.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jere P
 */
public interface IProductoRepo extends CrudRepository<Producto, Integer> {

    @Query("select p from Producto p where p.descripcion like %?1%")
    public List<Producto> buscarPorDescripcion(String descripcion);
}
