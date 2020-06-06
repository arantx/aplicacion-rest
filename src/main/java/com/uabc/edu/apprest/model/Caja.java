package com.uabc.edu.apprest.model;

import javax.persistence.*;

@Entity
@Table(name="Caja")
public class Caja {
    //Id, conjunto articulos, cajero
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCaja;

    @Column(name="Estado")
    private Boolean estado;

    @Column(name="Cajero")
    private Long id;

    public Long getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Long id) {
        this.idCaja = idCaja;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Long getIdCajero() {
        return id;
    }

    public void setIdCajero(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Caja [idCaja=" + idCaja + ", estado=" + estado+ ",id="+id+"]";
    }


}
