package com.uabc.edu.apprest.service;

import com.uabc.edu.apprest.model.Articulo;
import com.uabc.edu.apprest.model.Caja;
import com.uabc.edu.apprest.repository.ArticuloRepository;
import com.uabc.edu.apprest.repository.CajaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CajaService {
    @Autowired
    CajaRepository repo;
    public Caja createOrUpdateCaja(Caja entity){
        if (entity.getIdCaja() == null){
            entity = repo.save(entity);
            return entity;
        }
        else{
            Optional<Caja> cajaa = repo.findById(entity.getIdCaja());
            if (cajaa.isPresent()){
                Caja newEntity = cajaa.get();
                newEntity.setEstado(entity.getEstado());
                newEntity = repo.save(newEntity);
                return newEntity;
            }else {
                entity = repo.save(entity);
                return entity;
            }
        }
    }

    public List<Caja> getCajas() {
        List<Caja> result = (List<Caja>) repo.findAll();

        if(result.size() > 0) {
            return result;
        } else {
            return new ArrayList<Caja>();
        }
    }

    public Caja getCajaById(Long id) {
        Optional<Caja> caja = repo.findById(id);

        if(caja.isPresent()) {

        }
        return caja.get();

    }

    public void deleCajaById(Long id){
        Optional<Caja> caja = repo.findById(id);
        if (caja.isPresent()){
            repo.deleteById(id);
        }
    }

}
