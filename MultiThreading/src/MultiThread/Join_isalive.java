package MultiThread;

class Execute implements Runnable{
    @Override
    public void run() {
        System.out.println("The run() has starting Executing ");
        try {
            System.out.println("Runing On the way");
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}
public class Join_isalive {
    public static void main(String[] args) throws Exception  // For the join method WE need Duck Our Code
    {
        System.out.println("The program is in main method");
        Execute e = new Execute();
        Thread th = new Thread(e);
        System.out.println(th.isAlive());  // The thread will have no life until the start method --It will give false
        th.start();
        System.out.println(th.isAlive());  // It will have life it will give true
        th.join();

        System.out.println("End of the Program");
    }
}
