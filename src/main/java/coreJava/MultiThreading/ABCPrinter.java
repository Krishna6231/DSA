package coreJava.MultiThreading;

public class ABCPrinter {
    private int turn =0;
    synchronized void printA() throws InterruptedException{
        for(int i=0;i<10;i++){
            while(turn%3!=0){
                wait();
            }
            System.out.print("A");
            turn++;
            notifyAll();
        }
    }
    synchronized void printB() throws InterruptedException{
        for(int i=0;i<10;i++){
            while(turn%3!=1){
                wait();
            }
            System.out.print("B");
            turn++;
            notifyAll();
        }
    }
    synchronized void printC() throws InterruptedException{
        for(int i=0;i<10;i++){
            while(turn%3!=2){
                wait();
            }
            System.out.print("C");
            turn++;
            notifyAll();
        }
    }
    public static void main(String[] args) {
        ABCPrinter print = new ABCPrinter();

        Thread t1 = new Thread(() -> {
           try{
               print.printA();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
        });
        Thread t2 = new Thread(() -> {
            try{
                print.printB();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t3 = new Thread(() -> {
            try{
                print.printC();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
