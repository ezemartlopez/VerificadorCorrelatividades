package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias_inscripcion;

    // Constructor
    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias_inscripcion = new ArrayList<>(); // Inicialización vacía
    }

    public void agregarMateria(Materia materia){
        this.materias_inscripcion.add(materia);
    }

    public boolean aprobada(){
        if (materias_inscripcion.isEmpty()) return false;

        boolean inscripcion_valida = true;

        for(Materia materia : this.materias_inscripcion){
            inscripcion_valida = this.alumno.puedeCursar(materia);
            if(!inscripcion_valida) break;
        }

        return inscripcion_valida;
    }
}
