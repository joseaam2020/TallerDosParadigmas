package TallerDosParadigmas;
public class CarroFactory extends PolePositionFactory{

    @Override
    public Carro crearCarro(){
        return new CarroJugador(0, null);
    }
}
