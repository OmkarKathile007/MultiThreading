package MultiThread;

class Queue{
    int x;
    boolean Intxvalue = false;
    synchronized void Put(int j){
        try {
            if (Intxvalue==true){
                wait();
            }
            else {
                x=j;
                System.out.println("Producer Produce the Data :"+x);
                Intxvalue = true;
                notify();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    synchronized void Get(){
        try {
            if (Intxvalue==false){
                wait();
            }
            else {

                System.out.println("Consumer Consume the Data :"+x);
                Intxvalue=true;
                notify();
            }
        }catch (Exception e){
            System.out.println("Exception Occur");
        }

    }

}
class Producer extends Thread{
    Queue q;
    public Producer(Queue p){
        q=p;
    }

    public void run(){
        int i =1;
        while (true){
            q.Put(i++);
        }
    }
}
class Consumer extends Thread{
    Queue q;
    public Consumer(Queue r){
        q=r;
    }
    public void run(){

        while (true){
            q.Get();
        }
    }
}
public class Producer_Consumer {
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.start();
        c.start();
    }
}
