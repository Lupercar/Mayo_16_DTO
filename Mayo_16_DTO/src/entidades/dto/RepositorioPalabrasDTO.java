package entidades.dto;

import entidades.Palabra;
import entidades.RepositorioPalabras;
import java.util.List;
import org.jdesktop.observablecollections.ObservableList;
import org.jdesktop.observablecollections.ObservableCollections;

public class RepositorioPalabrasDTO {
//    Has-A de RepositorioPalabras
    private RepositorioPalabras repo = new RepositorioPalabras();
    
    private ObservableList listaObservable; 

    public RepositorioPalabrasDTO() {
        listaObservable = ObservableCollections.
                observableList(repo.getPalabras());
    }
    
     public void add(Palabra p){
        if( p!=null) 
//                al añadir avisa a los oyentes
            listaObservable.add(p); 
        else 
            throw new RuntimeException("No es una palabra válida.");
    }
    
    public List<Palabra> getPalabras(){
        return listaObservable; 
    }
}//fin class entidades.dto.RepositorioPalabrasObservable
