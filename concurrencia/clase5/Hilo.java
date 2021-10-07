package clase5;

public class Hilo extends Thread{

    public String nombre;
    public Contador contador;

    public Hilo(String nombre, Contador contador){
        this.nombre = nombre;
        this.contador = contador;
    }

    @Override
    public void run(){
        for(int i = 0; i < 2000; i++){
                this.contador.aumentar();
        }
        System.out.println(nombre + " termino en " + contador.getCuenta());
    }
}
