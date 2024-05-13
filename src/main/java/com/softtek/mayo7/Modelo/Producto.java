package com.softtek.mayo7.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "id_suministrador")
    private int id_suministrador;

    @Column(name = "precio_unidad")
    private int precio_unidad;

    @Column(name = "stock")
    private int stock;
}
