package Ejercicio1;

public class Empleado {
	int final id = 1000;
	String nombre;
	int edad;
    private static int cont=0;    
    
    //CONSTRUCTORES
    public Empleado ()
    {
    	this.cont++;
    	this.id = cont;
    }
    
    //GETS Y SETS
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
	
	
}

