public class MiTarea implements Runnable{


    private final int number;

    MiTarea(int number) {
        this.number=number;
    }

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s: %d ^ %d = %.0f%n", Thread.currentThread()
                    .getName(), number, i, (Math.pow(number, i)));

        }

    }
}
