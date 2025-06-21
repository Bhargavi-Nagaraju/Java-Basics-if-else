// Program to check if a year is a leap year using nested if
public class LeapYear{
public static void main(String[]args){
int year = 2025;
if(year > 0){
  if(year % 4 == 0){
    if(year % 100 == 0){
      if(year % 400 == 0){
          System.out.println(year + " is a leap year");
      }else {
          System.out.println(year + " is not a leap year");
        }
        } else {
        System.out.println(year + " is a leap year");
        }
        }else{
         System.out.println(year + " is not a leap year");
        }
        }else{
        System.out.println(" year must be positive");
}
}
}

// sample output
// 2025 is not a leap year
