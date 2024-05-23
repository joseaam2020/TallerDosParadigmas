package TallerDosParadigmas;

public abstract class Carro {

    //atributos
    protected int velocidad;
    protected String color;

    //metodos
    public abstract void acelerar();
    public abstract void frenar();
    public abstract void disparar();
    public abstract void actualizar();

    //getters y setters
    public int getVelocidad(){

        return velocidad;
    }
    public void setVelocidad(int velocidad){

        this.velocidad = velocidad;

    }
    public string getColor(){

        return color;
    }
    public void setColor(string color){

        this.color = color;
    }
    
}