package com.uabc.edu.apprest.web;

import com.uabc.edu.apprest.model.Caja;
import com.uabc.edu.apprest.model.Cajero;
import com.uabc.edu.apprest.model.Venta;
import com.uabc.edu.apprest.service.CajaService;
import com.uabc.edu.apprest.service.CajeroService;
import com.uabc.edu.apprest.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import com.uabc.edu.apprest.model.Articulo;
import com.uabc.edu.apprest.service.ArticuloService;

@RestController
@RequestMapping("/")
public class ProductoController {

    @Autowired
    private ArticuloService articuloService;
    private CajeroService cajeroService;
    private CajaService cajaService;

    private VentaService ventaService;

    @RequestMapping
    public String getArticulos(Model model) {
        List<Articulo> list = articuloService.getArticulos();
        model.addAttribute( "articulos",list);
        return "Tienda";
     }
    @RequestMapping(path = {"/edit", "/edit/{id}"})
    public String editArticuloById(Model model, @PathVariable("id") Optional<Long> id)
    {
        if (id.isPresent()) {
            Articulo entity = articuloService.getArticuloById(id.get());
            model.addAttribute("articulo", entity);
        } else {
            model.addAttribute("articulo", new Articulo());
        }
        return "Tienda";

    }
    @RequestMapping(path = "/delete/{id}")
    public String deleArticuloById(Model model, @PathVariable("id") Long id)

    {
        articuloService.deleArticuloById(id);
        return "redirect:/";
    }

    @RequestMapping(path = "/createArticulo", method = RequestMethod.POST)
    public String createOrUpdateArticulo(Articulo articulo)
    {
        articuloService.createOrUpdateArticulo(articulo);
        return "redirect:/";
    }

///cajero
    @RequestMapping("/cajero")
    @ResponseBody
    public String getAllEmployees(Model model) {
        List<Articulo> list = articuloService.getArticulos();
        model.addAttribute( "cajeros",list);
        return "Tienda2";
    }
    @GetMapping("/get/{id}")
    @ResponseBody
    public ResponseEntity<Optional<Cajero>> getCajeroByIds(@PathVariable("id") Long id) {

        return new ResponseEntity<Optional<Cajero>>(cajeroService.getCajeroById(id), HttpStatus.OK);
    }
    @RequestMapping(path = {"/edit2", "/edit2/{id}"})
    public String editCajeroById(Model model, @PathVariable("id") Optional<Long> id)
    {
        if (id.isPresent()) {
            Optional<Cajero> entity = cajeroService.getCajeroById(id.get());
            model.addAttribute("cajero", entity);
        } else {
            model.addAttribute("cajero", new Articulo());
        }
        return "Tienda2";

    }
    @RequestMapping(path = "/delete2/{id}")
    public String deleCajeroById(Model model, @PathVariable("id") Long id)

    {
        cajeroService.deleCajeroById(id);
        return "redirect:/Tienda2";
    }
    @RequestMapping(path = "/createCajero", method = RequestMethod.POST)
    public String createOrUpdateCajero(Cajero cajero)
    {
        cajeroService.createOrUpdateCajero(cajero);
        return "redirect:/Tienda2";
    }


}

