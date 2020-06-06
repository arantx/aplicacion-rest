package com.uabc.edu.apprest.repository;

import com.uabc.edu.apprest.model.Cajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CajeroRepository extends JpaRepository<Cajero,Long> {
}