import java.util.Scanner;
public class CompoundInterest{
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the value of principal: ");
          double p=sc.nextDouble();
          System.out.println("Enter the value of rate: ");
          double r=sc.nextDouble();
          System.out.println("Enter the value of time: ");
          double t=sc.nextDouble();
          double a=p*(Math.pow(1+r/100, t));
           double cp=a-p;
           System.out.println("Compound interest is: "+cp);
           sc.close();
         }
}0