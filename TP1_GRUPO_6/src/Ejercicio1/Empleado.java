package Ejercicio1;

public class Empleado {
	private final int id;
	private String nombre;
	private int edad;
    private static int cont = 1000;    
    
    //CONSTRUCTORES
    public Empleado ()
    {
    	this.id = cont;
    	this.nombre = "sin nombre";
    	this.edad = 99;
    	cont++;
    }
    
    
	//METODOS

	
    //GETS Y SETS
    public int getId() {
        return id;
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

