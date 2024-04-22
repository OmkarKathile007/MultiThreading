package MultiThread;

class Library implements Runnable {
    String b1 = new String("Java");
    String b2 = new String("SQl");
    String b3 = new String("DSA");

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("Student1")) {
            try {
                Thread.sleep(2000);
                synchronized (b1) {
                    System.out.println("Student-1 Acquire Book " + b1);
                    Thread.sleep(3000);
                    synchronized (b2) {
                        System.out.println("Student-1 Acquire Book " + b2);
                        Thread.sleep(3000);
                        synchronized (b3) {
                            System.out.println("Student-1 Acquire Book " + b3);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception Occur");
            }
        }
        else {
            try {
                synchronized (b3) {
                    System.out.println("Student-2 Acquire Book " + b3);
                    Thread.sleep(3000);
                    synchronized (b2) {
                        System.out.println("Student-2 Acquire Book " + b2);
                        Thread.sleep(3000);
                        synchronized (b1) {
                            System.out.println("Student-2 Acquire Book " + b1);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception Occur");
            }
        }


    }
}

     public class Deadlock {
        public static void main(String[] args) {
            Library lb = new Library();
            Thread th1 = new Thread(lb);
            Thread th2 = new Thread(lb);
            th1.setName("Student1");
            th2.setName("Student2");
//            th1.setPriority();
            th1.start();
            th2.start();

        }
    }

