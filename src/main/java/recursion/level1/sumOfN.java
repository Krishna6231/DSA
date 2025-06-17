package recursion.level1;

import java.util.Scanner;

public class sumOfN {
    public static int sumOfN(int n){
        if(n==1) return 1;
        return n+sumOfN(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfN(n));
    }
}
