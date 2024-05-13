package com.softtek.mayo7.DTO;

import com.softtek.mayo7.Modelo.Producto;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductoDTO {
    private int id;
    @NotEmpty
    @Size(min = 2,max = 60)
    private String nombreProducto;
    @NotNull
    private int id_suministrador;
    @Min(4)
    @Max(2000)
    private int precio;

    public Producto castProducto(){
        Producto p1= new Producto();
        p1.setId(id);
        p1.setNombre(nombreProducto);
        p1.setId_suministrador(id_suministrador);
        p1.setPrecio_unidad(precio);
        return p1;
    }
    public ProductoDTO castProductoADto(Producto p){
        ProductoDTO pd1=new ProductoDTO();
        return  pd1;
    }
}
