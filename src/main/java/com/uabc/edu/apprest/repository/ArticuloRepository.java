package com.uabc.edu.apprest.repository;

import com.uabc.edu.apprest.model.Articulo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo,Long> {
}