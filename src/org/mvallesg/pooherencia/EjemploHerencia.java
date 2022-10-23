package org.mvallesg.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("===== Creando la instancia de la clase Alumno =====");
        Alumno alumno = new Alumno();
        alumno.setNombre("Mike");
        alumno.setApellido("Valles");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);

        System.out.println("===== Creando la instancia de la clase AlumnoInternacional =====");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);

        /* si la variable es del tipo del padre y se quiere usar un atributo o un método
        de la clase hija, hay que hacer un cast por cada vez que se quiera hacer esto
        Persona alumno = new Alumno();
        alumno.setNombre("Mike");
        alumno.setApellido("Valles");
        ((Alumno)alumno).setInstitucion("Instituto Nacional");
        * */

        System.out.println("===== Creando la instancia de la clase Profesor =====");
        Profesor profesor = new Profesor();
        profesor.setNombre("Pepo");
        profesor.setApellido("Ventall");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());
        System.out.println(alumnoInt.getNombre());
        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
