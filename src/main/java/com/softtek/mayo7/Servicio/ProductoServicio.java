package com.softtek.mayo7.Servicio;

import com.softtek.mayo7.Modelo.Producto;
import com.softtek.mayo7.Repositorio.IProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio{

    @Autowired
    private IProductoRepositorio productoRepositori;

    @Override
    public Producto insertar(Producto p){return productoRepositori.save(p);}

    @Override
    public Producto modificar(Producto p){return productoRepositori.save(p);}

    @Override
    public void eliminar(int id){productoRepositori.deleteById(id);}

    @Override
    public List<Producto> obtenerTodods(){return productoRepositori.findAll();}

    @Override
    public Producto obtenerUno(int id){ return productoRepositori.findById(id).orElse(new Producto());}

}
