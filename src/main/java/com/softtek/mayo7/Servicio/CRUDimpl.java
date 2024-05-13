package com.softtek.mayo7.Servicio;

import com.softtek.mayo7.Repositorio.IGenericoRepositorio;

import java.util.List;

public abstract class CRUDimpl<T,ID> implements ICRUD<T,ID> {
    protected abstract IGenericoRepositorio<T,ID> getRepo();


    @Override
  public  List<T> obtenerProducto() {
        return getRepo().findAll();
    }


    public T crearProducto(T t) {
        return getRepo().save(t);
    }

   public T actualizarProducto(T t){
        return getRepo().save(t);
   }

   public T obtenerUno(ID id){
        return getRepo().findById(id).orElse(null);

   }
    public void deleteProducto(ID id){
        getRepo().deleteById(id);
    }


}
