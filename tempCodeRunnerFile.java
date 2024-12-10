String name;
    int age;
    char gender;
    String grades;
    //2. Functions/Methods/Behaviours/procedures
    //what a class does, what a student does
    void study(){
        System.out.println(name+"is studying");
    }


public class ClassObject {
    public static void main(String[] args) {
        //object/actual entity of a class
        Studentexample student1 = new Studentexample();
        //object is a physical component/takes memory
        student1.name ="Reesta";
        student1.age = 20;
        student1.gender ='F';
        student1.grades ="A";
        //Assign should match the data type of properties
        System.out.println(student1.name);
        student1.study();

        //Create a variable student2 with your name 
    }
    
}
