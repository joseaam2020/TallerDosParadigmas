package TallerDosParadigmas;

public class CarroJugador extends Carro {
    public CarroJugador(int velocidad,String color){
        this.velocidad = velocidad;
        this.color = color;
    }
    
    //metodos
    public void acelerar(){

        //logica de acelerar
        System.out.println("Acelerando...");

    }

    public void frenar(){

        //logica para frenar
        System.out.printIn("Frenando...");

    }
    
    public void disparar(){

        //logica  para disparar
        System.out.printIn("Disparando...");

    }

    public void actualizar(){

        //logica para actualizar el estado
        System.out.printIn("Actualizado...");
        
    }

}
