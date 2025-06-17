package recursion.level1;

import java.util.Scanner;

public class reverseOfNum {
    public static String  reverseOfNum(int n,String s){
        if(n%10==n) return String.valueOf(n);
        return s+(n%10)+reverseOfNum(n/10,s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(reverseOfNum(n,new String()));
    }
}
