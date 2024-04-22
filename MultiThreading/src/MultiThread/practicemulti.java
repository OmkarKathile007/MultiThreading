package MultiThread;

import java.util.Scanner;

class Pattern extends Thread{
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("This an Runnable method in MyThread0");
        for (int i = 0;i<5;i++){
            for (int j = 0;j<i;j++){
                System.out.print("*");
            }try {
                Thread.sleep(2000);
                System.out.println();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class Method extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(2000);
                System.out.println("This is an Thread class");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class practicemulti{
    public static void main(String[] args) {
       Pattern p = new Pattern();
       Method mt = new Method();

       p.start();
       mt.start();
    }
}
