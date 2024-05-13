package com.softtek.mayo7.Controlador;

import com.softtek.mayo7.Modelo.Lugar;
import com.softtek.mayo7.Modelo.Producto;
import com.softtek.mayo7.Servicio.ILugarServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/lugar")

public class ControladorLugar {
    @Autowired
    private ILugarServicio lugarServicio;

    @GetMapping
    public List<Lugar> obtenerProcuto() throws SQLException, ClassNotFoundException {
        return lugarServicio.obtenerProducto();
    }

    @GetMapping("/{id}")
    public Lugar obtener1Procuto(@PathVariable(name = "id") Integer id) throws SQLException, ClassNotFoundException {
        return lugarServicio.obtenerUno(id);
    }

    @PutMapping
    public Lugar actualizarProducto(@RequestBody Lugar p) throws SQLException, ClassNotFoundException {
       return lugarServicio.actualizarProducto(p);
    }

    @PostMapping
    public Lugar crearProducto(@RequestBody Lugar p) throws SQLException, ClassNotFoundException {
        return lugarServicio.crearProducto(p);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable int id) throws SQLException, ClassNotFoundException {
        lugarServicio.deleteProducto(id);
    }


}
