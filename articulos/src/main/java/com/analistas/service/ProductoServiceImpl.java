/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.service;

import com.analistas.entities.Producto;
import com.analistas.repository.IProductoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jere P
 */
@Service
public class ProductoServiceImpl implements IProductoService{

    //Dependence Injection
    @Autowired
    IProductoRepo repo;
    
    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) repo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findOne(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        repo.save(producto);
    }

    @Override
    @Transactional
    public void delete(int id) {
        repo.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> buscar(String texto) {
        return repo.buscarPorDescripcion(texto);
    }
    
}
