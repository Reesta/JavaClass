import java.nio.file.SecureDirectoryStream;

public class ClassFunction {
    //make a function called studentDetail
    //that takes an argument for student name,age and gender
    //print hte following when the function is called 
    //student detail
    //Name : xyz
    //Age  : 20
    //gender: M
    //Data fetched successfully 
    
        public static void studentDetails(String name, int age, String gender){
     
            //this function will print name age and gender
            System.out.println("Name:"+name+"\nage:"+age+"\ngender:"+gender);
        }
        public static void main(String[] args) {
            String name = "Saugat";
            int age = 90;
            String gender = "Male";
            studentDetails(name, age, gender);
     
           
        }
    }
    
    //Task
    //make a function called square
    //takes one int 
    //returns square of the given int
    //print the value of square after calling the function 
    public static int square(int num){
        return num *num;
    } 
    int squareRet =square(6);
    System.out.println("Squared"+ squareRet);

    //Main 
    System.out.println(Math.pow(3,2));
    //Task (H/W)
    //Using Math.sqrt
    //using Math.sqrt
    //Print the square root from 1-10 (use a loop)
