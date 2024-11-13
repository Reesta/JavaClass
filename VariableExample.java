public class VariableExample {  //case sensitive
    //Instance Variable class ma banako variable
    int instanceVariable = 100;
    //instanceVariable can only be accessed with the object
    //Static Variable
    static boolean staticVariable = false;
    //staticVariable can be accssed with class directly
    void firstFunction(){  //variable can be only accessed in function scope
        int localVariable = 300;
        //Local variable are made inside a function/constructer scope/block
        System.out.println("Local Variable: " + localVariable);
    }
 
 
    public static void main(String[] args) {
        int localVariable2 = 400;
        System.out.println("Local Variable: "+ localVariable2);
        // to use the instance variable of a class, make object
        // syntax: ClassName objVariable = new ClassName();
        VariableExample variableExampleobj = new VariableExample(); // class ko variable lai object vanxa or objet banako
        // the variable of VariableExample is called object m here variableExampleobj
        System.out.println("Instance Variable:"+ variableExampleobj.instanceVariable);
        //static variable can be accessed with, ClassName.variableName
        System.out.println("Static Variable:"+ VariableExample.staticVariable);
 
        // java typecasting primitive datatype
        //widening casting /Implicit Casting/ automatic
        // conversion of smaller datatype to larger datatype (size/capacity)
        // byte -> short -> char -> int-> long -> float -> double ->
 
        byte byteVariable = 10;
        short shortVariable = byteVariable; //here byte is automatically converted to short
        System.out.println(shortVariable);
 
   
 
        int mathMark = 20;
        double mathConveted = mathMark; // int is automatically converted to double -> 20.0
        System.out.println("Int to double "+ mathConveted);
 
 
        //narrowing casting/explicit casting/manual
        // conversion of larger datatype to smaller datatype
 
         double gpa = 3.4;
         int gpaInt = (int) gpa;
         System.out.println(" GPA int " + gpaInt);
         int floatConversion = (int) 400.33f; //400
         System.out.println(floatConversion);
 
 
         //calculation
         float mathcalc = 1/2; // 1/2 in int is 0 -> 0.0
         System.out.println(mathcalc);
 
         float mathcalcSolve = 1.0f/2; //either one value float
         float mathcalcSolve2 = (float) 1/2; //or manual cast
 
         System.out.println(mathcalcSolve);
         
         System.out.println(mathcalcSolve2);
 
         /*
          * Task
          make an instance variable firstname
          make a neew object and print the firstname
          calculate and print the following
          double avg = 13/2
          float pct = 411/100
          */
 
 
 
 
 
    }
 
 
 
   
}
 