package entidades;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPalabras {
    static private List<Palabra> listaPalabras = new ArrayList<>(); 
    
    static{
        listaPalabras.add(new Palabra("Palabra 1")); 
        listaPalabras.add(new Palabra("Palabra 2")); 
        listaPalabras.add(new Palabra("Palabra 3")); 
    }
    
    public void add(Palabra p){
        if( p!=null )
            listaPalabras.add(p); 
        else 
            throw new RuntimeException("No es una palabra válida.");
    }
    
    public List<Palabra> getPalabras(){
        return listaPalabras; 
    }
}//fin class RepositorioPalabras
