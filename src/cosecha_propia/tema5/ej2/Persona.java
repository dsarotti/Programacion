package cosecha_propia.tema5.ej2;

import java.sql.Date;

public abstract class Persona {
    protected String dni;
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected Date fechaNacimiento;
    
    public Persona(String dni, String nombre, String apellido1, String apellido2, Date fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
    }

    
}