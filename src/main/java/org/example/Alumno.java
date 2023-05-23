package org.example;

public class Alumno {
    private int rut;
    private String nombre;
    private String apellido;
    private String matricula;

    public Alumno(int rut, String nombre, String apellido, String matricula){
        this.matricula =matricula;
        this.rut=rut;
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public int getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
//terminado. ni tocar.