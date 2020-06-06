package com.uabc.edu.apprest.repository;

import com.uabc.edu.apprest.model.Caja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CajaRepository extends JpaRepository<Caja,Long> {
}
