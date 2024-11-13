public class UserUsingArgs {
    public static void main(String[]args){
//The parameter String [] args takes array of input 
// when running from command line
// you can compile java file with 
//javac FileName.java
//java FIleNmae args1 args2 
//or 
//java FileName.java args1 args2
System.out.println("First args"+ args[0]);
System.out.println("Second args"+ args[1]);

//The args are in database string to convert or parse any args 
int argsParse1 = Integer.parseInt(args[0]);
int argsParse2 = Integer.parseInt(args[1]);
System.out.println("Sum of args" + (argsParse1 +argsParse2));
    
}
}
/*
 * Task 
 * 
 */