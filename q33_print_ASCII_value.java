import java.util.Scanner;
public class q33_print_ASCII_value {
   public static void main(String[] args){
     char[] characters = {'A' , 'B' , 'C' , 'a' , 'b' , 'c' , '0' , '1' , '2' , '$' , '#' , '@' };
     for(char c : characters) {
          int asciivalue = (int) c;
          System.out.println("Character : " + c + ", ASCII value : " + asciivalue);
    }
 } 
}