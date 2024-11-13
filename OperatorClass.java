public class OperatorClass {
    public static void main(String[]args){
        //arithmetic operator 
        // +,-,*,/,%
    int intvar1 =10,intVar2 =20;
    int addOper =intvar1 +intVar2; //10+20
    int minusOper =intvar1 -intVar2;//10-20
    int multOper =intvar1 * intVar2; //10*20
    int divOper =intvar1 /intVar2; //10/20 
    int modOper =intvar1 % intVar2;// 10/20 (remainder)

    //Assignment operator 
    int assignVar =10;
    assignVar += 20; //10+20-> 30
    assignVar -= 15; //30-15 -> 15
    assignVar *= 2; //15 *2-> 30
    assignVar /=10; //30/10 -> 3
    assignVar %= 2; //3%b2-> 1 
    //Unary operator 
    int unaryVar =20;
    unaryVar ++; //unaryVar +=1; 20 +1; 21
    unaryVar --; //unaryvar -= 1;21 -1; 20

    // Relational Operator 
    int relVar1 =20, relvar2 =30;
    boolean equalOper =relVar1 == relvar2; //20 =30 ? false 
    boolean greaterOper = relVar1> relvar2; //20> 30 ? false 
    boolean lessequalOper = relvar2 <= 30; //30 <= 30? true 
    boolean notEqual = 20 !=10; //true 
    //Logical Operator 
    int logVar1 =10,logVar2 =20,logVar3 =23;
    boolean andOper =true && true;
    boolean andOpervar =(logVar1<logVar2) && (logVar3 ==logVar2);//true&& false 
    boolean orOper =false || false|| true;
    boolean orOperVar =(logVar1 < logVar2)|| (logVar3 == logVar2);
    boolean notOper = !(logVar1<logVar2); // ! true -> false

    //Ternary operator 
    /*
     * string status ;
     * int marking =40;
     * if (marking > 40){
     * status ="pass";
     * }else{
     * status ="fail";
     * }
     */
    int marking =40;
    String status =(marking >40)? "pass": "fail";
    System.out.println("status :" + status);
    

/*
 * Task
 * add the following variable
 * oopmarking -> int 
 * architecturemarking -> int 
 * databasemarking -> int 
 * creativeThinking -> int 
 * make a float avg and calculate the avg of the markings 
 * make a boolean expressions to check if 
 * all the marking is greater or equal to 40
 * and check if the avg is greater than 50
 * make a result -> string and check the boolean 
 * if the true set result as "Good job" else set result as "Bad job"
 * print the result  
 */

 int oopMarking = 40;
          int architectureMarkingMarking = 45;
          int databaseMarkinng= 30;
          int creativethinkingMarking =50;
          float avg = (float) (oopMarking+architectureMarkingMarking+databaseMarkinng+creativethinkingMarking)/4;
          boolean check = oopMarking >=40 && databaseMarkinng >= 40
          && architectureMarkingMarking >=40 && creativethinkingMarking >= 40 && avg >=50;
          String result = check? "Good Job": "Bad Job";
          System.out.println(result);
    }
}