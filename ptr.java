import java.io.*;
import java.util.*;
class ptr
{
    public static void main(String[] args){
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row size");
    int row=sc.nextInt();
    for(int i=0;i<row;i++)
    {
        for(int space=row;space>i;space--)
        {
            System.out.print(" ");
        }
        num=1;
        for(int j=0;j<=i;j++)
        {
            System.out.print(num+" ");
            num=num*(i-j)/(j+1);
        }
        System.out.print("\n");
    }
    }
}
    
   