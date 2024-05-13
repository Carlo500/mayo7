package com.softtek.mayo7.Servicio;

import java.util.List;

public interface ICRUD<T,ID>{
    List<T> obtenerProducto();
    T crearProducto(T t);
    T actualizarProducto(T t);
    T obtenerUno(ID id);
    void deleteProducto(ID id);

}
