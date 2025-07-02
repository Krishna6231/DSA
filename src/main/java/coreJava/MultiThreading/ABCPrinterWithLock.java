package coreJava.MultiThreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ABCPrinterWithLock {
    private int turn = 0;
    private final Lock lock= new ReentrantLock();
    private final Condition conditionA = lock.newCondition();
    private final Condition conditionB = lock.newCondition();
    private final Condition conditionC = lock.newCondition();

    public void printA(){
        for(int i=0;i<10;i++){
            lock.lock();
            try{
                while(turn%3!=0){
                    conditionA.await();
                }
                System.out.print("A");
                turn++;
                conditionA.signal(); //Wake Up B
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
    public void printB(){
        for(int i=0;i<10;i++){
            lock.lock();
            try{
                while(turn%3!=0){
                    conditionB.await();
                }
                System.out.print("B");
                turn++;
                conditionB.signal(); //Wake Up B
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
    public void printC(){
        for(int i=0;i<10;i++){
            lock.lock();
            try{
                while(turn%3!=0){
                    conditionC.await();
                }
                System.out.print("C");
                turn++;
                conditionC.signal(); //Wake Up A
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        ABCPrinterWithLock print = new ABCPrinterWithLock();
//        Thread tA = new Thread(print::printA);
//        Thread tB = new Thread(print::printB);
//        Thread tC = new Thread(print::printC);
        print.printA();
    }
}

