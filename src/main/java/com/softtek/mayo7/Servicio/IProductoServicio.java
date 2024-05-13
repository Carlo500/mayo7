package com.softtek.mayo7.Servicio;

import com.softtek.mayo7.Modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    Producto insertar(Producto p);
    Producto modificar(Producto p);
    void eliminar(int id);
    List<Producto> obtenerTodods();
    Producto obtenerUno(int id);
}
