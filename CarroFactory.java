package TallerDosParadigmas;
public class CarroFactory extends PolePositionFactory{
    public Carro crearCarro(){

        return new CarroJugador(0, null);
    }

    public Poder crearPoder(){

        //se crea el poder 

        return null;
    }
}
