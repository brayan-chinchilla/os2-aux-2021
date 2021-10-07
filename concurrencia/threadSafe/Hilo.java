package threadSafe;


public class Hilo extends Thread{

    private ListConcurrent list;
    private int value;

    private final int tipo_op;

    public Hilo(ListConcurrent list, int value, int tipo_op) {
        this.list = list;
        this.value = value;
        this.tipo_op = tipo_op;
    }

    @Override
    public void run() {
        switch(tipo_op){
            case 0:
                this.list.insertar(this.value);
                break;

            case 1:
                if(! this.list.encontrar(this.value)){
                    System.err.println("Did not find value");
                }
                break;
        }
    }
}
