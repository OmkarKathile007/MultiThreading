package MultiThread;

class Car implements Runnable{
    synchronized public void run(){
        System.out.println("Entered the Block");
        try {
            System.out.println("Entered The Parking Lot");
            Thread.sleep(3000);
            System.out.println("Searching For the Car");
            Thread.sleep(2000);
            System.out.println("Drive the car");
            Thread.sleep(2000);
            System.out.println("Came back and Park");
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println("Entered the exception Block");
        }
    }

}
public class Synchronized {
    public static void main(String[] args) {
        Car c = new Car();
        Thread tc1 = new Thread(c);
        Thread tc2 = new Thread(c);
        Thread tc3 = new Thread(c);
        tc1.start();
        tc2.start();
        tc3.start();
    }
}
