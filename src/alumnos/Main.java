package alumnos;
import java.io.Console;

/* Una clase Main dentro del paquete alumnos para realizar pruebas sobre los 
    métodos declarados en otra clase del paquete (class Alumno)  */

public class Main{
    public static void main(String[] args) {
        Alumno  alumno1 = new Alumno();
        Console c = System.console();
        //set edad
        System.out.println("introduce su edad: ");
        alumno1.setEdad(Integer.parseInt(c.readLine()));
        //get edad
        System.out.println("la edad introducida y guardada es : " + alumno1.getEdad());

        //set curso
        System.out.println("Introduce su curso(1, 2, 3, 4) ");
        alumno1.setCurso(Integer.parseInt(c.readLine()));
        //get curso
        System.out.println("El curso introducido y guardado es: " + alumno1.getCurso());

        //set nombre
        System.out.println("Introduce su nombre");
        alumno1.setNombre(c.readLine());
        //get nombre
        System.out.println("El nombre intruducido y guardado es: " + alumno1.getNombre());

        //set apellido
        System.out.println("Introduce su apellido");
        alumno1.setApellido(c.readLine());
        //get apellido
        System.out.println("El nombre intruducido y guardado es: " + alumno1.getApellido());
        
        //set correo
        System.out.println("Introduce el correo: ");
        alumno1.setCorreo(c.readLine());
        //get correo
        System.out.println("el correo introducido y guardado es : " + alumno1.getCorreo());

    }
}