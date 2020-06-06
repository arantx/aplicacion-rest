package com.uabc.edu.apprest.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.uabc.edu.apprest.model.Articulo;
import com.uabc.edu.apprest.repository.ArticuloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloService {

    @Autowired
    ArticuloRepository repo;

    public List<Articulo> getArticulos() {
        List<Articulo> result = (List<Articulo>) repo.findAll();

        if(result.size() > 0) {
            return result;
        } else {
            return new ArrayList<Articulo>();
        }
    }

    public Articulo getArticuloById(Long id) {
        Optional<Articulo> articulo = repo.findById(id);

        if(articulo.isPresent()) {

        }
        return articulo.get();

    }

    public Articulo createOrUpdateArticulo(Articulo entity){
        if (entity.getId_articulo() == null){
            entity = repo.save(entity);
            return entity;
        }
        else{
            Optional<Articulo> articulo = repo.findById(entity.getId_articulo());
            if (articulo.isPresent()){
                Articulo newEntity = articulo.get();
                newEntity.setPrecio(entity.getPrecio());
                newEntity.setDescripcion(entity.getDescripcion());
                newEntity = repo.save(newEntity);
                return newEntity;
            }else {
                entity = repo.save(entity);
                return entity;
            }
        }
    }
    public void deleArticuloById(Long id){
        Optional<Articulo> articulo = repo.findById(id);
        if (articulo.isPresent()){
            repo.deleteById(id);
        }
    }

}