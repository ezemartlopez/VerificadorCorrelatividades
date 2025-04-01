package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materias_aprobadas;

    // Constructor
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materias_aprobadas = new ArrayList<>(); // Inicialización vacía
    }

    public boolean puedeCursar(Materia materia){
        return materia.cumpleCorrelativas(materias_aprobadas);
    }
}
