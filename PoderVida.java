package TallerDosParadigmas;
public class PoderVida extends Poder {

    //constructor
    public PoderVida(String tipo,int posicion,int sumaVida){
        
        this.tipo = tipo;
        this.posicion = posicion;
        this.sumaVida = sumaVida;
    }

    public void onDestroy(){
        //logica para quitar el poder vida
    }
    
    
}
