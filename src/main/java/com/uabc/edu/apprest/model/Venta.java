package com.uabc.edu.apprest.model;

import javax.persistence.*;

@Entity
@Table(name="Venta")
public class Venta {
    //Id, conjunto articulos, cajero
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;

    @Column(name="Articulos")
    private Long id_articulo;

    @Column(name="Cajero")
    private Long id;

    @Column(name="Caja")
    private Long idCaja;


    @Column(name="Total")
    private Integer total;



    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long id) {
        this.idVenta = idVenta;
    }

    public Long getIdArticulo() {
        return id_articulo;
    }

    public void setIdArticulo(Long id) {
        this.id_articulo = id_articulo;
    }

    public Long getIdCajero() {
        return id;
    }

    public void setIdCajero(Long id) {
        this.id = id;
    }

    public Long getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Long id) {
        this.idCaja = idCaja;
    }
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    @Override
    public String toString() {
        return "Venta [idVenta=" + idVenta + ", id_articulo=" + id_articulo +
                ", id=" + id + ", idCaja=" + idCaja   + ",total = "+total + "";
    }


}
