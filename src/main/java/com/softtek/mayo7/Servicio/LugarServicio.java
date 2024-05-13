package com.softtek.mayo7.Servicio;

import com.softtek.mayo7.Modelo.Lugar;
import com.softtek.mayo7.Repositorio.IGenericoRepositorio;
import com.softtek.mayo7.Repositorio.ILugarRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class LugarServicio extends CRUDimpl<Lugar,Integer> implements ILugarServicio{

    @Autowired
    private ILugarRepositorio repo;

    @Override
    protected IGenericoRepositorio<Lugar,Integer> getRepo(){return repo;}


}
