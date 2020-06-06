package com.uabc.edu.apprest.repository;

import com.uabc.edu.apprest.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta,Long> {
}