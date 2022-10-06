package alumnos;

public class Alumno {
    private int edad, curso;
    private String nombre, apellido, correo;

    //ESTABLECER (setters)
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setCurso(int curso){
        this.curso=curso;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    
    //DEVOLVER (getters)
    public int getEdad(){
        return this.edad;
    }
    public int getCurso(){
        return this.curso;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getCorreo(){
        return this.correo;
    }
}
