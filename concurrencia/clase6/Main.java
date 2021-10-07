package clase6;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Hilo hiloA = new Hilo("HiloA");
        Hilo hiloB = new Hilo("HiloB");
        Hilo hiloC = new Hilo("HiloC");

        hiloA.start();
        hiloB.start();
        hiloC.start();

        hiloA.join();
        hiloB.join();
        hiloC.join();

        System.out.println("Contador: " + Shared.contador);
    }
}
