package recursion.level1;

import java.util.Scanner;

public class prodOfDigits {
    public static int  prodOfDigits(int n){
        if(n==0) return 1;
        //another condition
//        if(n%10 == n) return n;
        //1+F(1) -> n%10=1 n=1 return 1

        return n%10*prodOfDigits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prodOfDigits(n));
    }
}
