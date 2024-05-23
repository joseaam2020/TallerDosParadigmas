package TallerDosParadigmas;

public class Servidor {
    
    private static Servidor instanciaServidor;
    Cliente[] clientes;

    public Servidor getServidor(){
        if(instanciaServidor == null){
            instanciaServidor = new Servidor();
        }
        return instanciaServidor;
    }

    public void actualizarCliente(int index,int id){
        this.clientes[index].actualizarID(id);
    }

    public void actualizarPista(){}

    public void run(){
        instanciaServidor.run();
    }

}