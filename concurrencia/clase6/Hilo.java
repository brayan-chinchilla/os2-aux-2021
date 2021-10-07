package clase6;

public class Hilo extends Thread{

    public String nombre;

    public Hilo(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run(){
        log("Inicio");
        try{
            log("Tratar de obtener permiso");
            Shared.sem.acquire();
            log("Permiso obtenido");
            for(int i = 0; i < 20; i++){
                System.out.println(Shared.contador++);

                //Simular la posibilidad de un cambio de contexto
                Thread.sleep(10);
            }
        } catch(InterruptedException e){
            System.out.println(e.getMessage());
        } finally{
            log("Devuelve permiso");
            Shared.sem.release();
        }

    }

    public void log(String message){
        System.out.println(this.nombre + ": "  + message);
    }
}
