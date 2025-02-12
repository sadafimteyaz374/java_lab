import java.util.Scanner;
public class SimpleInterest{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of principal : ");
       int p = sc.nextInt();
       System.out.println("Enter the value of interest rate : ");
       float r = sc.nextFloat();
       System.out.println("Enter the value of time duration : ");
       int t = sc.nextInt();
       float s_i = (p*r*t)/100;
       System.out.println("The simple interest is : "+s_i);
       sc.close();
      }
}