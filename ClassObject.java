//class made above or below another class scope 
class Studentexample{
    //class is just a representation on what a student does
    //logical component /does not take memory
    //1.Attributes/Properties/Data members /Fields
    //what defines a class,what defines a student
    String name;
    int age;
    char gender;
    String grades;
    //2. Functions/Methods/Behaviours/procedures
    //what a class does, what a student does
    void study(){
        System.out.println(name+"is studying");
    }
}

//Task
//create a class called Dog
//Add attrinutes name,breed,age,color
//Add functions bark() that prints dog's name is barking
//Add functions eat() that print Dog's age and breed eating
//Make 2 object in main and run the bark and eat function

class Dog{
    String name;
    String breed;
    int age;
    String color;

    void bark(){
        System.out.println(name+ " is Barking");
    }
void eat (){
    System.out.println(age +" "+ breed +"is eating");
}
}



public class ClassObject {
    public static void main(String[] args) {
        //object/actual entity of a class
        Studentexample student1 = new Studentexample();
        //object is a physical component/takes memory
        student1.name ="Anisha";
        student1.age = 20;
        student1.gender ='F';
        student1.grades ="A";
        //Assign should match the data type of properties
        System.out.println(student1.name);
        student1.study();

         Dog dog1 =new Dog ();
         dog1.name ="Milo";
         dog1.breed ="Greman shepard";
         dog1.age = 3;
         dog1.color ="Orange";

         dog1.bark();
         dog1.eat();

        
    }
    
}


    