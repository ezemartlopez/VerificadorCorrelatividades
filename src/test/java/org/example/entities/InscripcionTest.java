package org.example.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @Test
    @DisplayName("Testing para validar si una inscripcion puede aprobarse")
    public void TestValidarInscripciones(){
        Alumno pablito = new Alumno("Pablito");
        Materia discreta = new Materia("Discreta");
        Materia algoritmos = new Materia("Algortitmos");
        Materia paradigmas = new Materia("Paradigmas");
        paradigmas.agregarCorrelativa(discreta);
        paradigmas.agregarCorrelativa(algoritmos);

        Inscripcion inscripcion = new Inscripcion(pablito);
        inscripcion.agregarMateria(discreta);
        inscripcion.agregarMateria(algoritmos);

        //Caso Positivo
        Assertions.assertTrue(inscripcion.aprobada(), "La inscripcion fue aprobada como se esperaba.");

        //Caso Negativo
        //agregamos a proposito una materia a la cual no puede inscribirse
        inscripcion.agregarMateria(paradigmas);
        Assertions.assertFalse(inscripcion.aprobada(), "La inscripcion fue rechazada como se esperaba.");
    }
}