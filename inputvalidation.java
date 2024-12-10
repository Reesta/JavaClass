import java.util.Scanner;

public class inputvalidation {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String password = "abc123";
    String userPassword = scan.nextLine();
    while(!userPassword.equals(password)){
        System.out.println("Incorrect password");
        userPassword = scan.nextLine();
    }
System.out.println("congratulation");
//note: to compare two string string1.equals(string2)

//for integer 
System.out.println("Enter a positive number");
int num = scan.nextInt();
while(num<0){
    System.out.println("Incorrect number, positive number only");
    num = scan.nextInt();
}
System.out.println("Positive num" +num);
scan.close();
   } 
}
