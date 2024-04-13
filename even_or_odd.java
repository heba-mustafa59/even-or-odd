package q1;

import java.util.Scanner;

public class Q1 {//heba jalil

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
 // odd even number check
        if (n%2==0){
            System.out.println("even number");
        }
        else if (n%2!=0){
            System.out.println("odd number");
        }
     }
     
//or in short code of keystroke we can write without curly braces because there is not more than one line in if block
     
        // if (n%2==0)
        //     System.out.println("even number");
        // else(n%2!=0)
        //     System.out.println("odd number");
        
     }
       
}

