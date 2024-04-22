package MultiThread;
import java.util.Scanner;
class Tv implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" Entered in the HALL");
        synchronized (this){
            try {
                System.out.println(Thread.currentThread().getName()+" Switch on the Tv");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName()+" Searching for the Movie");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName()+" Watching the Movie");
                Thread.sleep(10000);
                System.out.println(Thread.currentThread().getName()+" Switch of the Tv");
                Thread.sleep(3000);
            }
            catch (Exception e ){
                System.out.println("Exception has Occured");
            }
        }
    }
}
public class Synchronized2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tv one = new Tv();
        Thread son1 = new Thread(one);
        Thread son2 = new Thread(one);
        Thread son3 = new Thread(one);
        System.out.println("Enter the Name of the first person");
        String p1 = sc.next();
        System.out.println("Enter the name of the second person");
        String p2 = sc.next();
        System.out.println("Enter the name of the Third person");
        String p3 = sc.next();
        son1.setName(p1);
        son2.setName(p2);
        son3.setName(p3);
        son1.start();
        son2.start();
        son3.start();


    }
}
