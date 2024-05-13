package com.softtek.mayo7.Repositorio;

import com.softtek.mayo7.Modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

public interface IProductoRepositorio extends IGenericoRepositorio<Producto,Integer> {

}
