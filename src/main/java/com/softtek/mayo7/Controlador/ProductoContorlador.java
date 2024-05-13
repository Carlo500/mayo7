package com.softtek.mayo7.Controlador;

import com.softtek.mayo7.DTO.ProductoDTO;
import com.softtek.mayo7.Modelo.Producto;
import com.softtek.mayo7.Servicio.IProductoServicio;
import com.softtek.mayo7.exepciones.ExcepcionPersonalizadaNoEncontrado;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/Producto")
@CrossOrigin(origins = "http://localhost:4200")

public class ProductoContorlador {
        @Autowired
        private IProductoServicio productoServicio;

        @GetMapping
        public ResponseEntity<List<ProductoDTO>> obtenerProcuto() {
            List<Producto> productosBBDD =productoServicio.obtenerTodods();
            List<ProductoDTO> productosDto= new ArrayList<>();
            for (Producto producto: productosBBDD){
                ProductoDTO pDto= new ProductoDTO();
                productosDto.add(pDto.castProductoADto(producto));
            }
            return new ResponseEntity<>(productosDto,HttpStatus.OK);
        }

        @GetMapping("/{id}")
        public ResponseEntity<ProductoDTO> consultarUno (@PathVariable(name="id") Integer id) {
            Producto p1 = productoServicio.obtenerUno(id);
            if (p1 == null) {
            throw new ExcepcionPersonalizadaNoEncontrado("EMPLEADO NO ENCONTRADO + id);" + id);
            }
            return new ResponseEntity<>((new ProductoDTO()).castProductoADto(p1),HttpStatus.OK);
        }

        @PostMapping
        public ResponseEntity<ProductoDTO> crearProducto(@Valid @RequestBody ProductoDTO p) throws SQLException, ClassNotFoundException {
            Producto p1=p.castProducto();
            p1=productoServicio.insertar(p1);
            return new ResponseEntity<>(p.castProductoADto(p1), HttpStatus.CREATED);
        }
        @PutMapping
        public void modificarProducto(@RequestBody Producto p) throws Exception {
            Producto p1= productoServicio.obtenerUno(p.getId());
            if (p1==null){
                throw new Exception("Empleado no encontrado "+ p.getId());
            }
            productoServicio.modificar(p);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> eliminarProducto(@PathVariable(name = "id") int id) throws SQLException, ClassNotFoundException {
            Producto p1= productoServicio.obtenerUno(id);
            if (p1== null){
                throw new ExcepcionPersonalizadaNoEncontrado("EMPLEADO NO ENCONTRADO "+ id);
            }
            productoServicio.eliminar(id);
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
}
