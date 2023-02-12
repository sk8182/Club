import java.util.HashSet;

/**
 * Una clase Persona que registra el nombre de una persona y 
 * el conjunto de hobbies que tiene.
 * 
 * @author (Julio Martínez Cazorla) 
 * @version (08/01/2023)
 */
public class Persona
{
    // Atributos
    private String nombre;
    private HashSet<String> hobbies;

    /**
     * Un constructor con un parámetro (el nombre de la persona).
     * El constructor crea el conjunto de hobbies inicialmente vacío
     */
    public Persona(String nombre){

        this.nombre= nombre;
        this.hobbies = new HashSet<String>();//conjunto de hobbies inicialmente vacío
    }

    // accesor para el nombre
    public String getNombre(){

        return nombre;
    }

    //añade el nuevo hobby de la persona si no lo tiene (se añaden los string en minúsculas)
    public void addHobbie(String h){

        this.hobbies.add(h.toLowerCase());    
    }

    //devuelve true o false si tiene o no la persona ese hobby
    public boolean tieneHobbie(String h){

        return this.hobbies.contains(h.toLowerCase());
    }

    //devuelve el conjunto de hobbys como un String
    public String hobbiesToString(){

        return this.hobbies.toString();   
    }

    //devuelve un representación textual del objeto Persona (nombre y conjunto de hobbys)
    public String toString(){
        
        return ("A "+nombre+" le gusta "+this.hobbies.toString());
    }    
}

