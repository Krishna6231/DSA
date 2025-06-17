package recursion.level1;

import java.util.Scanner;

public class oneToN {
    public  static int num = 1;
    public static void oneToN(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        //another base condition
//        if(n==0){
//            return;
//        }

        oneToN(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oneToN(n);
    }
}
