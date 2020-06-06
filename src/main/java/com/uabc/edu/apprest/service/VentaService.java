package com.uabc.edu.apprest.service;

import com.uabc.edu.apprest.model.Articulo;
import com.uabc.edu.apprest.model.Venta;
import com.uabc.edu.apprest.repository.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VentaService {
    VentaRepository ventaRepo;
//consulta a los id
    public Venta createOrUpdateVenta (Venta entity){
        if (entity.getIdVenta() == null){
            entity = ventaRepo.save(entity);
            return entity;
        }
        else{
            Optional<Venta> venta = ventaRepo.findById(entity.getIdVenta());

            if (venta.isPresent()){
                Venta newEntity = venta.get();
                newEntity.setIdArticulo(entity.getIdArticulo());
                newEntity.setIdCajero(entity.getIdCajero());
                newEntity.setIdCaja(entity.getIdCaja());
                newEntity = ventaRepo.save(newEntity);
                return newEntity;
            }else{
                entity = ventaRepo.save(entity);
                return entity;
            }
        }
    }
    public Optional<Venta> getVentaById(Long id) {

            return ventaRepo.findById(id);
    }
    public void deleteVentaById(Long id)
    {
        Optional<Venta> venta = ventaRepo.findById(id);

        if(venta.isPresent())
        {
            ventaRepo.deleteById(id);
        }
    }
}
