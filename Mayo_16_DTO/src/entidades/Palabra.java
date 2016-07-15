package entidades;

public class Palabra {
    private String contenido; 
    
    public Palabra(){
        this("");
    }
    
    public Palabra(String contenido){
        super(); 
        setContenido(contenido);
    }
    
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return getContenido(); 
    }
}//fin class entidades.Palabra
