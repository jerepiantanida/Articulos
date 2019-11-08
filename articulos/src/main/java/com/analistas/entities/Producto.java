/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Jere P
 */
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    /**
     * @return the nro
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param nro the nro to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the disponible
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * @param disponible the disponible to set
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * @return the disponible
     */
   
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int numero;
    
     @NotEmpty
    private String cod_barra;
     
     @NotEmpty
    private String descripcion;
     
    @NotEmpty
    private String precio_compra;
    
    @NotEmpty
    private String precio_venta;
    
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fecha_vencimiento;
    
    @NotEmpty
    private boolean disponible;
    

    /**
     * @return the nro
     */
    
   
    /**
     * @return the cod_barra
     */
    public String getCod_barra() {
        return cod_barra;
    }

    /**
     * @param cod_barra the cod_barra to set
     */
    public void setCod_barra(String cod_barra) {
        this.cod_barra = cod_barra;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio_compra
     */
    public String getPrecio_compra() {
        return precio_compra;
    }

    /**
     * @param precio_compra the precio_compra to set
     */
    public void setPrecio_compra(String precio_compra) {
        this.precio_compra = precio_compra;
    }

    /**
     * @return the precio_venta
     */
    public String getPrecio_venta() {
        return precio_venta;
    }

    /**
     * @param precio_venta the precio_venta to set
     */
    public void setPrecio_venta(String precio_venta) {
        this.precio_venta = precio_venta;
    }

    /**
     * @return the fecha_vencimiento
     */
    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    /**
     * @param fecha_vencimiento the fecha_vencimiento to set
     */
    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }
    
    
    
    
}
