package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    //constructor
    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>(); // Inicialización vacía
    }

    public void agregarCorrelativa(Materia correlativa){
        this.correlativas.add(correlativa);
    }

    public boolean cumpleCorrelativas(List<Materia> materias_cursadas){
        return this.correlativas.stream().allMatch(materias_cursadas::contains);
    }
}
