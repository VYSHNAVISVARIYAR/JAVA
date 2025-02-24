import java.util.Scanner;

public class Complex{
public static void main(String[] args){

    System.out.println("Enter the real part of the first complex number:");
    Scanner sc = new Scanner(System.in);
    int r1 = sc.nextInt();
    System.out.println("Enter the imaginery part of the first complex number:");
    int r2 = sc.nextInt();
   
    System.out.println("The first complex number is = "+r1+"+"+r2+"i");
   
    System.out.println("Enter the real part of the second complex number:");
    int r3 = sc.nextInt();
    System.out.println("Enter the imaginery part of the first complex number:");
    int r4 = sc.nextInt();
   
    System.out.println("The second complex number = "+r3+"+"+r4+"i");
   
    int s1 = r1+r3;
    int s2 = r2+r4;
   
   System.out.println("Sum of two numbers is "+s1+"+"+s2+"i");
 
}
}
