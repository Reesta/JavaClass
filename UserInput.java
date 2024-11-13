import java.util.Scanner ;

public class UserInput {
    public static void main(String[]args){
 // to take input import scanner class at the top of the file 
 //import java.util.Scanner;
 //make an object of the scanner and take input from object 

 Scanner scan =new Scanner (System.in);
 System.out.println("You age:");
 int ageInput =scan.nextInt();
 System.out.println("You are " + ageInput);

 System.out.println("Over 18?");
 boolean over18Input = scan.nextBoolean();
 System.out.println(over18Input);

 System.out.println("You weight:");
 double weightInput =scan.nextDouble();
 System.out.println(weightInput);


 //after using scanner for primitive data want input for string 
 //you need to clear the enter input 
 scan.nextLine();
 System.out.println("Your name?");
 String name =scan.nextLine();
 System.out.println(name);

 scan.close(); //must close scanner object to avoid input locks 
}
}