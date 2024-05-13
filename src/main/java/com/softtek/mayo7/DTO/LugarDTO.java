package com.softtek.mayo7.DTO;

import com.softtek.mayo7.Modelo.Lugar;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LugarDTO {
    private int id;
    @NotEmpty
    @Size(min = 2,max = 60)
    private String nombre;

    public Lugar castLugar(){
        Lugar l1 =new Lugar();
        l1.setIdLugar(id);
        l1.setNombre(nombre);
        return l1;
    }

    public LugarDTO castLugarADto(Lugar l){
        LugarDTO ld1=new LugarDTO();
        return ld1;
    }
}
