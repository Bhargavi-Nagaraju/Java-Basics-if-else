// Number Sign Checker using Scanner input and if-else ladder
// Determines if a number is positive, negative, or zero
// Scanner class, if-else ladder, variables, data types

import java.util.Scanner;
public class SignCheck{
public static void main (String []args){
Scanner sc = new Scanner(System.in); // create a scanner object
System.out.println("Enter a number:"); // Ask for input
int number = sc.nextInt();
if(number > 0){
System.out.println("Positive");
}
else if ( number < 0){
System.out.println("Negative");
}
else{
System.out.println("Zero");
}
sc.close();
}
}

// sample output:
// Enter a number:
// 8
Positive

