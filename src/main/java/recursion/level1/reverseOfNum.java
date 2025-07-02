package recursion.level1;

import java.util.Scanner;

public class reverseOfNum {
    public static String  reverseOfNum(int n,String s){
        if(n%10==n) return String.valueOf(n);
        return s+(n%10)+reverseOfNum(n/10,s);
    }

    //Another Way with global variable
//    static int  sum =0;
//    public static void rev1(int n){
//        if(n==0) return;
//        int r=n%10;
//        sum=sum*10+r;
//        rev1(n/10);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int num = sc.nextInt();
        System.out.println(reverseOfNum(n,new String()));
//        rev1(num);
//        System.out.println(sum);
    }
}
