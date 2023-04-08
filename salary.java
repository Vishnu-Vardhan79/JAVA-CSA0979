import java.io.*;
import java.util.*;
class salary
{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int s,ts=0;
    char g;
    System.out.println("Enter the Salary : ");
    s=sc.nextInt();
    System.out.println("Enter the grade of Employee : ");
    g=sc.next().charAt(0);
    if(g=='A')
    {
        if(s<10000){
        ts=s+s*7/100;}
        else{
        ts=s+s*5/100;}
    }
    else if(g=='B')
    {
        if(s<10000){
        ts=s+s*12/100;}
        else{
        ts=s+s*10/100;}
    }
    else
    {
        System.out.println("Enter a Valid Grade : ");
    }
    System.out.println("The Total Salary is : "+ts);
    }
}

      