import java.util.Scanner;
public class QuotientReminder{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the dividend value : ");
      int D = sc.nextInt();
     System.out.println("Enter the divisor value  : ");
     int d = sc.nextInt();
     int reminder = D%d;
     int quotient = D/d;
     System.out.println("The value of quotient is : "+quotient+"  and reminder is : "+reminder);
    sc.close();
    }
}