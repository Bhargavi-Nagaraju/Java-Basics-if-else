// Grade Calculator using Scanner input and if-else ladder
// Takes marks as input and assigns a grade based on the score.
// Scanner, if-else ladder, variables, data types

import java.util.Scanner;

public class Grade{
public static void main (String []args){
Scanner sc = new Scanner (System.in); // create scanner object
System.out.println ("Enter marks:"); // Ask for input
int marks = sc.nextInt(); // Read the input
if(marks >= 90){
System.out.println ("Grade A");
}
else if (marks >= 75){
System.out.println ("Grade B");
}
else if ( marks >= 60){
System.out.println ("Grade C");
}
else if ( marks >= 40){
System.out.println ("Grade D");
}
else {
System.out.println ("Fail");
}
sc.close(); // close the scanner object
}
}

// Enter marks:
// 95
// Grade A

