/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizfinal1;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class ArregloNotas {
    private ListaEstudiantes[10][]Estudiante;
    private int index=0;
                
    public void infoEstudiantes(){
        String Estudiante[][]=new Estudiante[0][1];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                Estudiante[i][j]=InserteEstudiante(JOptionPane.showInputDialog(null, "Inserte el nombre del estudiante"))
            }
            
        }
    }
    
    


/*  String Estudiante[][] estudiantes;
    private int index;

    // Constructor
    public EscuelaProgramador(int filas, int columnas) {
        estudiantes = new Estudiante[filas][columnas];
        index = 0;
    }

    // Método para agregar estudiantes
    public void agregarEstudiantes() {
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
                String curso = JOptionPane.showInputDialog("Ingrese el curso del estudiante:");
                String profesor = JOptionPane.showInputDialog("Ingrese el nombre del profesor:");
                double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del estudiante:"));
                
                estudiantes[i][j] = new Estudiante(nombre, curso, profesor, calificacion);
            }
        }
    }

    // Listado general de estudiantes
    public void listarEstudiantes() {
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                Estudiante estudiante = estudiantes[i][j];
                if (estudiante != null) {
                    System.out.println(estudiante.getNombre() + " - " + estudiante.getCurso() + " - " +
                                       estudiante.getProfesor() + " - " + estudiante.getCalificacion());
                }
            }
        }
    }

    // Nombre del estudiante con la nota mayor
    public String obtenerMejorEstudiante() {
        if (estudiantes.length == 0) return "No hay estudiantes registrados.";
        Estudiante mejor = estudiantes[0][0];
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                if (estudiantes[i][j] != null && estudiantes[i][j].getCalificacion() > mejor.getCalificacion()) {
                    mejor = estudiantes[i][j];
                }
            }
        }
        return mejor.getNombre();
    }

    // Nombre del estudiante con la nota menor
    public String obtenerPeorEstudiante() {
        if (estudiantes.length == 0) return "No hay estudiantes registrados.";
        Estudiante peor = estudiantes[0][0];
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                if (estudiantes[i][j] != null && estudiantes[i][j].getCalificacion() < peor.getCalificacion()) {
                    peor = estudiantes[i][j];
                }
            }
        }
        return peor.getNombre();
    }

    // Promedio de calificaciones
    public double obtenerPromedioCalificaciones() {
        if (estudiantes.length == 0) return 0.0;
        double suma = 0.0;
        int contador = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                if (estudiantes[i][j] != null) {
                    suma += estudiantes[i][j].getCalificacion();
                    contador++;
                }
            }
        }
        return suma / contador;
    }

    // Calificaciones por encima del promedio
    public void calificacionesPorEncimaDelPromedio() {
        double promedio = obtenerPromedioCalificaciones();
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                if (estudiantes[i][j] != null && estudiantes[i][j].getCalificacion() > promedio) {
                    System.out.println(estudiantes[i][j].getNombre() + " - " + estudiantes[i][j].getCalificacion());
                }
            }
        }
    }

    // Calificaciones por debajo del promedio
    public void calificacionesPorDebajoDelPromedio() {
        double promedio = obtenerPromedioCalificaciones();
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                if (estudiantes[i][j] != null && estudiantes[i][j].getCalificacion() < promedio) {
                    System.out.println(estudiantes[i][j].getNombre() + " - " + estudiantes[i][j].getCalificacion());
                }
            }
        }
    }
}
