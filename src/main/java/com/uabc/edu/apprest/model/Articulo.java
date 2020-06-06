package com.uabc.edu.apprest.model;

import lombok.Data;
import javax.persistence.*;
@Data
@Entity(name = "ARTICULO")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_articulo;

    @Column(name = "precio",nullable = false)
    private Double precio;

    @Column( name = "descripcion",nullable = false)
    private String descripcion;

    public Long getIdArticulo() {
        return id_articulo;
    }

    public void setIdArticulo(Long id) {
        this.id_articulo = id_articulo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescrpcion(String descripcion) {
        this.descripcion = this.descripcion;
    }

    @Override
    public String toString() {
        return "Articulo [id_articulo=" + id_articulo + ", precio=" + precio +
                ", descripcion=" + descripcion  + "]";
    }
}
