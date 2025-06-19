// Voter Eligibility Checker using Scanner input and if-else
// Checks whether a person is eligible to vote based on age (must be 18 or older)
// Scanner class, if-else statement, variables, data types

import java.util.Scanner;

public class Voter{
public static void main (String []args){
Scanner sc = new Scanner (System.in); // create scanner object
System.out.println ("Enter age:"); // Ask for input
int age = sc.nextInt(); // Read the input
if(age >= 18){
System.out.println ("can vote");
}
else {
System.out.println ("can't vote");
}
sc.close(); // close the scanner object
}
}

// sample output:
// Enter age:
// 18
// can vote

