package org.example;

public class Principal {
    public static void main(String[] args) {
        Inicializar();
    }
    public static void Inicializar(){
        Curso curso=new Curso("Paulo",
                1,
                "ICI-I");
        curso.AddAlumno(new Alumno(20944005-9, curso.getNombre(), "Toledo", curso.getCarrera()));

    }
}