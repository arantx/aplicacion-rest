package com.uabc.edu.apprest.model;

import javax.persistence.*;

@Entity
@Table (name = "Cajero")
public class Cajero {
    //Cajeros tienen
    // id, Nombre, ApellidoPaterno, ApellidoMaterno
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="Nombre")
    private String Nombre;

    @Column(name="Apellido_Paterno")
    private String apellidoPaterno;

    @Column(name="Apellido_Materno")
    private String apellidoMaterno;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellidoPaternoe() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    @Override
    public String toString() {
        return "Cajero [id=" + id + ", Nombre=" + Nombre +
                ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno   + "]";
    }

}
