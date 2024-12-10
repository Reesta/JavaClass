import java.util.ArrayList;
public class ArrayListexample {

    public static void main(String[] args) {
        //Import ArrayLoist from java util
        ArrayList<String> fruits =new ArrayList<>(); //[]
        //Add/append
        fruits.add("Apple");//["Apple"]
        fruits.add("grapes");//["Apple","Grapes"]
        fruits.add("Apple");//["Apple","Grapes","Mango"]
        //ArrayList can be directly printed 
        System.out.println(fruits);
        //Access
        System.out.println(fruits.get(0));// fruits[0]
        //update
        fruits.set(1,"Orange");//fruits[1]="Orange"
        //{"Apple","Orange","Mango"}
        //delete
        fruits.remove(0);// remove at 0 and shifts the rest
        //["Orange","Mango"]
        System.out.println(fruits.get(0));
        //Array list size/length 
        System.out.println("Fruits size" +fruits.size());

        //Task 
        //Index = 0
        //index < fruits.size()
        //loop the fruits and print"Eating" + fruitname
        
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Litchi");
 
        for (int index = 0; index < fruits.size(); index++) {
            String fruitName = fruits.get(index);
            System.out.println("Eating " + fruitName);
        }
        //For each loop 
        for(String element : fruits){
            System.out.println("Eating"+ element);
        }
        //["Orange","Mango"] -> foreach loops each element/data inside this array
        //the first loop will get the element"Orange"
        //the second loop will get the element "Mango"

    
        // task 1
        // Make an arratlist called grades and add the following
        // 'A, 'B', 'z', 'c', 'D', 'E', 'G'
        // To make arraylist, ArrayList<Character> grades; 
        // Edit the small c to capital 'C'
        // Edit the G to 'F'
        // print the first and last grade
        // remove the 'z'
        // print the 'E' grades
        // loop the grades and find the index of 'G' 
        //Note: The datatype for arrayList 
        //Integer-> int , Double-> double ,Float-> float,Boolean->boolean
        
                // Task 1: Create an ArrayList called grades and add the following
                ArrayList<Character> grades = new ArrayList<>();
                grades.add('A');
                grades.add('B');
                grades.add('z');
                grades.add('c');
                grades.add('D');
                grades.add('E');
                grades.add('G');
         
             
                grades.set(grades.indexOf('G'), 'F');
                System.out.println("First grade: " + grades.get(0));
                System.out.println("Last grade: " + grades.get(grades.size() - 1));

                grades.remove(Character.valueOf('z'));
                
                System.out.println("Grade E: " + grades.get(grades.indexOf('E')));
         
                int indexOfF = grades.indexOf('F');
                System.out.println("Index of 'F': " + indexOfF);
            }
        }
    
    



