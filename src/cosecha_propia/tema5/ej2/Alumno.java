package cosecha_propia.tema5.ej2;

import java.sql.Date;

public class Alumno extends Persona {
    private int nia;

    public Alumno(String dni, String nombre, String apellido1, String apellido2, Date fechaNacimiento, int nia) {
        super(dni, nombre, apellido1, apellido2, fechaNacimiento);
        this.nia = nia;
    }


}
