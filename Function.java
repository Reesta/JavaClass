public class Function {
    public static int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;

    }
    static void greet(){
        System.out.println("Says Hello");
    }
    

    public static void main(String[] args){

        //1.midfier -> public/private /default
        //2. static -> without object 
        //3.returnType -> what function returns
        //if you donot want to return anything"void" can be used 
        //3.functionName -> identifier to call function 
        //4. arguments/parameter-> additional data to send when calling function
        //note: function should be made in a class scope ,meaning on top of main() here 
        //Then function can be called here
        int value1 = 10;
        int value2 = 20;
        int returnedValue =add(10,20);//10,20 will be num1,num2 in the function
        System.out.println("Returned"+returnedValue);
        //call greet here 
        greet();
        greet();
    }
}
