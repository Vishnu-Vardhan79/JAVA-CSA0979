import java.io.*;
import java.util.*;
class atm
{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a,a1,b,b1,c,c1,d,d1,t;
    System.out.println("Denominations are 2000 , 500 , 200 , 100 ");
    System.out.println("Enter the First Denomination : ");
    a=sc.nextInt();
    System.out.println("Enter the number of notes : ");
    a1=sc.nextInt();
    System.out.println("Enter the Second Denomination : ");
    b=sc.nextInt();
    System.out.println("Enter the number of notes : ");
    b1=sc.nextInt();
    System.out.println("Enter the Third Denomination : ");
    c=sc.nextInt();
    System.out.println("Enter the number of notes : ");
    c1=sc.nextInt();
    System.out.println("Enter the Fourth Denomination : ");
    d=sc.nextInt();
    System.out.println("Enter the number of notes : ");
    d1=sc.nextInt();
    t=a*a1+b*b1+c*c1+d*d1;
    System.out.println("Total amount available in ATM is : "+t);
    }
}