package coreJava.String;

public class StringPerformance {
    /**
    This test clearly shows that String is highly inefficient for
     repeated concatenation because it’s immutable —
     every s = s + 'a' creates a new object in memory,
     which slows down performance drastically.

    On the other hand, StringBuilder and StringBuffer are mutable,
     so they change the original object in-place.
     StringBuilder is slightly faster than StringBuffer
     because it’s not synchronized, making it the better choice
     in single-threaded contexts.

    For thread-safe operations, StringBuffer is used —
     it’s synchronized but a bit slower than StringBuilder
    **/
     public static void main(String[] args) {
        String s="";
        StringBuilder sb = new StringBuilder();
        StringBuffer sbr = new StringBuffer();
        long start = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            s=s+'a';
        }
        long end = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            sb.append('a');
        }
        long end2 = System.currentTimeMillis();
        long start3 = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            sbr.append('c');
        }
        long end3 = System.currentTimeMillis();

         System.out.println("String Time: " + (end - start) + " ms");
         System.out.println("StringBuilder Time: " + (end2 - start2) + " ms");
         System.out.println("StringBuffer Time: " + (end3 - start3) + " ms");


     }
}
