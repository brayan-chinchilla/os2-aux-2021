package clase6;

import java.util.concurrent.Semaphore;

public class Shared {
    public static int contador = 0;
    public static Semaphore sem = new Semaphore(1);
}
