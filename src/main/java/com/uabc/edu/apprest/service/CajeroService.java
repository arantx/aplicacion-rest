package com.uabc.edu.apprest.service;

import com.uabc.edu.apprest.model.Cajero;
import com.uabc.edu.apprest.repository.CajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CajeroService {

    @Autowired
    CajeroRepository cajeroRepository;

    public List<Cajero> getAllEmployees(){
       List<Cajero> result =(List<Cajero>) cajeroRepository.findAll();
        if (result.size() > 0){
            return result;
        }else {
            return new ArrayList<Cajero>();
        }

      }
    public Optional<Cajero>   getCajeroById(Long id)
    {

        return cajeroRepository.findById(id);

    }
    public Cajero createOrUpdateCajero(Cajero entity){
        if (entity.getId() == null){
            entity = cajeroRepository.save(entity);
            return entity;
        }
        else{
            Optional<Cajero> cajero = cajeroRepository.findById(entity.getId());
            if (cajero.isPresent()){
                Cajero newEntity = cajero.get();
                newEntity.setNombre(entity.getNombre());
                newEntity.setApellidoMaterno(entity.getApellidoMaterno());
                newEntity.setApellidoPaterno(entity.getApellidoPaternoe());
                newEntity = cajeroRepository.save(newEntity);
                return newEntity;
            }else {
                entity = cajeroRepository.save(entity);
                return entity;
            }
        }
    }
    public void deleCajeroById(Long id){
        Optional<Cajero> cajero = cajeroRepository.findById(id);
        if (cajero.isPresent()){
            cajeroRepository.deleteById(id);
        }
    }

}

