package quizfinal1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class Estudiantes {
    private String Nombre;
    private String Curso;
    private String Profesor;
    private Double Calificacion;

    public Estudiantes(String Nombre, String Curso, String Profesor, Double Calificacion) {
        this.Nombre = Nombre;
        this.Curso = Curso;
        this.Profesor = Profesor;
        this.Calificacion = Calificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String Profesor) {
        this.Profesor = Profesor;
    }

    public Double getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(Double Calificacion) {
        this.Calificacion = Calificacion;
    }

   
}
