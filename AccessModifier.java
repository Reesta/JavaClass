class Employeeexample{
    //access modifier/visibility modifier
    //1.default -> when no modifier is specified
    //folder /packaged based 
    String name;
    //2.private-> only within a class
    private String email;
    //3. public -> can be accessed from anywhere
    public int age;
    //4. protected -> folder/packaged and sub-class
    protected String lastName;
    //same for function 
    private void setEmailData(String e){
        email = e;
    }
    void displayInfo(){
        System.out.println(name +" "+ age);
    }
}
//this keyword
class CalculatorExample{
    private int num1;//this.num1
    private int num2;//this.num2

    public void setNumbers(int num1, int num2){
        //when i want to set the
        //class num1 to argument num1
        this.num1 = num1;
    }
    public int displaySum(){
        return this.num1 +this.num2;
    }
}
//public class can only be one and
//should be same name as filename

public class AccessModifier {
    public static void main(String[] args) {
        Employeeexample ee = new Employeeexample();
        ee.name ="Ram";
        ee.age = 10;
        ee.lastName ="Bahadur";
        //ee.email = "ram@gmail.com";  //see the error here
        //private cannot be used outside of class

        ee.displayInfo();
        //same for private function 
        //ee.setEmailData("ram@gmail.com");

        CalculatorExample ce = new CalculatorExample();
        ce.setNumbers(10, 20); //num1 ,num2
        int sum =ce.displaySum();
        System.out.println("Sum "+ sum);
    }  
}
