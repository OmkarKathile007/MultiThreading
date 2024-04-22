package MultiThread;

class Omkar1Thread implements Runnable{
    public void run(){
        System.out.println("This is an Runnable method");
        System.out.println("Yeah ! I won  -- Omkar1");
    }
}
class Omkar2Thread implements Runnable{
    public void run(){
        System.out.println("Yeah ! I won  -- Omkar2");
        try{
            
            Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
public class practice2 {
    public static void main(String[] args) {

    }
}
