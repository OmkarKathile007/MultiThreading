package MultiThread;


class MyThread5 extends Thread{
    public void run(){
        String tName =Thread.currentThread().getName();
        if (tName.equals("ImportantMsg")){
            System.out.println("Calc method executed");

            ImportantMsg();
        }
        else {

            Calc();
        }
    }
    public void ImportantMsg(){
        System.out.println("The Important Messsage is printing");
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
    public void Calc(){
        System.out.println("This is an Calc method for the Calculations");
    }
}

public class Thread_Multitask {
    public static void main(String[] args) {
       MyThread5 MT = new MyThread5();
       MyThread5 MT2 = new MyThread5();
//       MT.setName("Calc");
       MT.setName("ImportantMsg");
       MT2.setName("Calc");
       MT.start();
       MT2.start();



    }
}
