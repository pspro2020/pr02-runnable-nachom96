public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if ((i % 2) == 0) {
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            } else {
                Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
            }
            new Thread(new MiTarea(i)).start();
        }


    }

}
