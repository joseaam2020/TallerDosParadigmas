package TallerDosParadigmas;

public class Servidor {
    
    protected static Servidor instanciaServidor;
    Cliente[] clientes;

    public Servidor getServidor(){
        return Servidor.instanciaServidor;
    }

    public void actualizarCliente(int index,int id){
        this.clientes[index].actualizarID(id);
    }

    public void actualizarPista(){}

    public void run(){
        this.getServidor().run();
    }

}