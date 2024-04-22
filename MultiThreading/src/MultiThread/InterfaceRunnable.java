package MultiThread;
import java.util.Scanner;


class Mythread implements Runnable{   // It is implementing Runnable interface there is an abstract method - Runnable
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = sc.nextInt();
        System.out.println("Enter the second Number");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println(c);
    }
}
class Calculations implements Runnable{
    public void run(){
        try {
            System.out.println("Method Will execute wait");

            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println("Sorry Something Went Wrong");
        }
        System.out.println("Method is loading Please wait");
        System.out.println("After the execution Method will run Successfully");
    }
}
public class InterfaceRunnable {
    public static void main(String[] args) {
        Mythread mt = new Mythread();
        Calculations c = new Calculations();
        Thread th = new Thread(mt);   // We are not extending thread class so we are passing Reference to the constructor
        Thread th3 = new Thread(c);
        th.start();
        th3.start();
    }
}
