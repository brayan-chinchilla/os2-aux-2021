package clase5;

public class Clase5 {

    public static void main(String args[]){


        //Main   -----------           print
        //HiloA             -----------

        Contador contador = new Contador();
        Hilo hiloA = new Hilo("Hilo A", contador);

        Hilo hiloB = new Hilo("Hilo B", contador);

        hiloA.start();
        hiloB.start();

        try {
            hiloA.join();
            hiloB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Contador termina en: " + contador.getCuenta());
    }
}
