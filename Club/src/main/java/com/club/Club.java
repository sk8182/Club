
/**
 * una clase Club que guarda en una colección ArrayList una serie de personas.
 * 
 * @author (Julio Martínez Cazorla) 
 * @version (08/01/2023)
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Club
{
    // Atributos
    private ArrayList<Persona> miembrosClub;

    /**
     * El constructor que crea la colección vacía
     */
    public Club(){
        this.miembrosClub=new ArrayList<>();
    }

    //añade una nueva persona a la colección dados su nombre y su conjunto de hobbys
    public void addPersona(String nombre, HashSet<String> hob){
        Persona p= new Persona(nombre);
        for(String h:hob){
            p.addHobbie(h);
        }
        miembrosClub.add(p);    
    }

    //devuelve cuántas personas en el club tienen un hobby determinado (utiliza un iterador)
    public int personasConHobbie(String cual){
        int contador=0;
        Iterator<Persona> it;
        it=miembrosClub.iterator();
        while(it.hasNext()){
            Persona p=it.next();
            if(p.tieneHobbie(cual)){
                contador++;
            }
        }
        return contador;
    }
    
    //muestra la relación de personas en el club (utiliza un for-each)
    public void printClub(){
        for(Persona p: miembrosClub){
            System.out.println(p);
        }
    }
    
    //Borra de la lista las personas con un determinado hobby y las añade en un conjunto que se devuelve (usa un iterador)
    public HashSet<String> borrarPersonasConHobbie(String cual){    
        HashSet<String> borrar = new HashSet<String>();
        Iterator<Persona> it;
        it=miembrosClub.iterator();
        while(it.hasNext()){
            Persona p=it.next();
            if(p.tieneHobbie(cual)){
                borrar.add(p.getNombre());
                it.remove();
            }
        }
        return borrar;
    }
} 
