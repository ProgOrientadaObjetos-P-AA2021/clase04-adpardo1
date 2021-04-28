package paquete2;

/**
 *
 * @author reroes
 */
public class Hospital {
    private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;
    /*
        Crear un constructor que reciba como parámetros
        valores que serán asignados a los atributos.
    
    */
    public Hospital (String nombr, String ciuda, int numeroDoctore, int numeroEnfermero){

         nombre= nombr;
         ciudad= ciuda;
         numeroDoctores = numeroDoctore;
         numeroEnfermeros= numeroEnfermero;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCiudad(String n){
        ciudad = n;
    }
    
    public void establecerNumeroDoctores(int n){
        numeroDoctores = n;
    }
    
    public void establecerNumeroEnfermeros(int n){
        numeroEnfermeros = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
    
    public int obtenerNumeroDoctores(){
        return numeroDoctores;
    }
    
    public int obtenerNumeroEnfermeros(){
        return numeroEnfermeros;
    }
    public String toString(){
        String cadena = String.format("Los datos del hospital son\n"
                + "Nombre: %s\n"
                + "Ciudad: %s\n"
                + "Numero de Doctores: %s\n"
                + "Numero de Enfermos %s\n",obtenerNombre(),
                obtenerCiudad(), obtenerNumeroDoctores(), obtenerNumeroEnfermeros());
        return cadena;
    }
}
