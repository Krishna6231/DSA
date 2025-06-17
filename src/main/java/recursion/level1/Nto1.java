package recursion.level1;

import java.util.Scanner;

public class Nto1 {

    public static void nto1(int n){
        if(n==1) {
            System.out.println(1);
            return;
        }
        //another base condition
//        if(n==0){
//            return;
//        }
        System.out.println(n);
        nto1(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nto1(n);
    }
}
