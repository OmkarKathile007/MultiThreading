package MultiThread;


import java.util.Scanner;

class Mythread1 extends Thread{
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a= sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        int res = a+b;
        System.out.println("Sum is :"+res);
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {   // run() is the inhereited method from the Thread class
        try {
            System.out.println("Method is getting Display");
            Thread.sleep(3000);      // The sleep method will execute the code after 3 sec for this Exception may occur for
                                                // that we need to handle the code
            System.out.println("Please Wait");
            System.out.println("Method is Display Finally");
        }
        catch (Exception e){
            System.out.println("Some Problem");
        }

    }
}
public class Timedelay_ThreadShecd {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        MyThread2 t2 = new MyThread2();
        t1.start();    // This start() method will go to the Thread-schedular and will execute the code without Wasting Single Time
        t2.start();
    }

}
