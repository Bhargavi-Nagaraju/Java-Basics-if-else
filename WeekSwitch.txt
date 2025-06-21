// Java program to print the day of the week using switch statement
public class WeekSwitch{
public static void main(String []args){
int day = 3;// Declare a variable to store the day number
// Switch statement to match the day number with the day name
switch(day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Enter a valid number");
        break;
}
}
}

// sample output
// Wednesday

