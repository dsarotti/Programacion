package clases;

public class MiClase {
    int id;
    String nombre;
    
    String miInfo(){
        return (" " + this.id +" "+ this.nombre);
    }
    int miId(){
        return this.id;
    }
    String miNombre(){
        return this.nombre;
    }
    
    @Override
    public String toString(){
        return ("N#: " + id + " Nombre: " + nombre);

    }
}