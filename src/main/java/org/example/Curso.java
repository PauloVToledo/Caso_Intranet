package org.example;

import java.util.List;
import java.util.ArrayList;
public class Curso {
    public Curso(String nombre) {
        this.nombre = nombre;
    }
    private String nombre;
    private List<Alumno> alumnos;
    private int modulo;
    private String carrera;
    public Curso(String nombre, int modulo, String carrera){
        this.nombre=nombre;
        this.modulo=modulo;
        this.carrera=carrera;
        this.alumnos=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public int getModulo() {
        return modulo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void AddAlumno(Alumno alumno){
        alumnos.add(alumno);
        System.out.println("Rut: "+ alumno.getRut()+", Modulo "+getModulo()+", Nombre: "+getNombre()+", Apellido: "+alumno.getApellido()+", Carrera: "+alumno.getMatricula());
        Validardor_Rut validar=new Validardor_Rut();
        String rut=""+alumno.getRut();
        System.out.println(validar.validarRut(rut));
    }

} //ni tocar, ready.