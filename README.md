# Validador de Inscripciones según Correlatividades

## Descripción

Este proyecto implementa un validador de inscripciones para carreras terciarias y universitarias, que verifica si las materias correlativas están aprobadas antes de permitir la inscripción a una nueva asignatura. El sistema se basa en tres clases principales: `Inscripción`, `Materia`, y `Alumno`.

### Requisitos

- Verificar si un alumno cumple con las materias correlativas necesarias para inscribirse en una nueva asignatura.
- La inscripción se rechaza si alguna materia no cumple con la condición de correlatividades.
- El método principal de la clase `Inscripción` es `boolean aprobada()`, que realiza la validación de las correlatividades.

## Estructura del Proyecto

El proyecto sigue los siguientes pasos:

1. **Diseño en Paradigma Orientado a Objetos**: El sistema está modelado mediante tres clases principales:
   - **Inscripción**: Contiene el método `aprobada()` para validar si el alumno cumple con los requisitos de correlatividad.
   - **Materia**: Representa cada materia con sus respectivas correlativas.
   - **Alumno**: Representa al alumno y las materias que ha aprobado.

2. **Implementación en Java**: La solución ha sido implementada en Java (JDK 21), siguiendo el diseño orientado a objetos.

3. **Pruebas Unitarias**: Se han creado pruebas unitarias que aseguran el correcto funcionamiento del validador. Use JUnit5.

## Diagrama de Clases

El diagrama de clases que representa el diseño del sistema está disponible en la carpeta `docs` y ha sido generado utilizando **PlantUML**. Este diagrama muestra la relación entre las clases `Inscripción`, `Materia` y `Alumno`, así como sus principales atributos y métodos.
