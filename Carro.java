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
    public String getColor(){

        return color;
    }
    public void setColor(String color){

        this.color = color;
    }
    
}