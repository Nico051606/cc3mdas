
package cc3.calcu;
import java.util.*;
public class Cc3Calcu {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        
        System.out.println("Choose operation (+, -, *)");
        String option = sc.next();
        
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        
        int result = 0;
        switch(option){
        
        case "+" :
        result = num1 + num2;