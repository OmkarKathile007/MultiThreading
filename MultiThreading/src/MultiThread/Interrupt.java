package MultiThread;

class Example implements Runnable{
    public void run(){
        System.out.println("The Run-method is Executed");
        try {
            for (int i = 0; i<3;i++){
                System.out.println("Focus is Important");
                Thread.sleep(3000);
            }
        }
        catch (Exception e){
            System.out.println("Interruption Occur");
            }
        }
    }
    public class Interrupt {
        public static void main(String[] args) throws Exception
        {
        Example ex = new Example();
        Thread t1 = new Thread(ex);
        t1.start();
        t1.interrupt();   // if the thread is in waiting/sleep state we can interrupt it
        t1.join();
        System.out.println("Program Executed");
        }
}
