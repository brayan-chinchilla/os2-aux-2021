package alternanciaEstricta;

public class AlternanciaEstricta {

    public static int contador;
    public static int turno;

    public static void randomOps(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        Thread hiloA = new Thread(){
            @Override
            public void run(){
                for(int i = 0; i < 50; i++){
                    while(turno != 0){/*Espera ocupada*/}
                    contador = contador + 1;
                    turno =1;
                }
                System.out.println("Hilo A termino en " + contador);
            }
        };

        Thread hiloB = new Thread(){
            @Override
            public void run(){
                for(int i = 0; i < 50; i++){
                    while(turno != 1){/*Espera ocupada*/}
                    contador = contador + 1;
                    turno = 0;

                    randomOps();
                }
                System.out.println("Hilo B termino en " + contador);
            }
        };

        hiloA.start();
        hiloB.start();

        try {
            hiloA.join();
            hiloB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Contador termina en:" + contador);
    }

}
