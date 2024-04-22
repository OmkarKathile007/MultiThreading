import java.util.Scanner;

class HorseRide implements Runnable {

  public void run() {
    System.out.println(Thread.currentThread().getName() + " Entered in the FarmHouse");
    synchronized (this) {
      try {
        System.out.println(Thread.currentThread().getName() + " Searching for the Horse");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " seat in the Horse");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " Riding the horse");
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + " Ride Over");
        Thread.sleep(2000);
      } catch (Exception e) {
        System.out.println("All Boyz Didnot arrived yet" + e);
      }
    }

  }

}

public class MultiTHread {
  public static void main(String[] args) {
    HorseRide hr = new HorseRide();
    Thread Boy1 = new Thread(hr);
    Thread Boy2 = new Thread(hr);
    Thread Boy3 = new Thread(hr);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first Person Name");
    String name1 = sc.next();
    System.out.println("Enter Second Person Name");
    String name2 = sc.next();
    System.out.println("Enter The third Person Name");
    String name3 = sc.next();

    Boy1.setName(name1);
    Boy2.setName(name2);
    Boy3.setName(name3);
    Boy1.start();
    Boy2.start();
    Boy3.start();

  }
}