package MultiThread;

import java.util.concurrent.ThreadLocalRandom;

public class Threading {
    public static void main(String[] args) {
        System.out.println("This is an Thread class");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Omkar");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("The priority after changing the thread is :");
        Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getPriority());


        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isInterrupted());
    }
}
