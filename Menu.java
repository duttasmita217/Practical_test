//2. Write a program to Menu driven program using switch statement
//( Find addition, subtraction, multiplication and division of to integer numbers )
import java.util.Scanner;
public class Menu {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            
            System.out.println("select 1 for sum");
            System.out.println("select 2 for subtraction");
            System.out.println("select 3 for multiplication");
            System.out.println("select 4 for division");
            System.out.println("select 5 to exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            if(ch==5) {
            	break;
            }
            
            System.out.println("Enter 1st number");
            int a = sc.nextInt();
            System.out.println("Enter 2nd number");
            int b = sc.nextInt();
            
            
            switch(ch) {
            case 1: 
                System.out.println("sum : "+ (a+b));
                break;
            case 2:
                System.out.println("Subtraction : " + (a-b));
                break;
            case 3:
                System.out.println("Multiplication : " + (a*b));
                break;
            case 4:
                System.out.println("Division : " + ((double)a/(double)b));
                break;
            default:
                System.out.println("Invalid choice");
                
                
            }
        }while(ch!=5);
        System.out.println("Exiting....");
    }
}
