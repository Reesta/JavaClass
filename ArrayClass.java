public class ArrayClass {
    public static void main(String[] args) {
//[] after a datatype in variable denotes array
//1. declare and allocate later
int [] arr1;
//allocate size
arr1 =new int[2]; //will create [0,0]
arr1 [0]=20; //[20,0]

//2.declare and allocate at the same line
int[] arr2 =new int[4]; //will create [0,0,0,0]
arr2[2]= 20; //[0,0,20,0]

//3. Declare and initialize 
int [] arr3 ={20,30,50,60,100};
//indexing example 
//0 1 2 3 4 
//20 30 50 60 100 

// array are mutable/can change the data 
arr3[0] =40;
arr3[4] = 200;
//40 30 50 60 200
System.out.println(arr3[0]);
System.out.println(arr3[1]);
//to get size of an arrayt,arr.length
System.out.println("Arr3 has count"+ arr3.length);
// illegal array operation
// arr3[0) = “Test123”; // mismatch datatye
// arr3 (10] = 100; // cannot use index more than size
 
// Task 1
// Make an array called names and allocate size of 3
// add the names Like, Ram, Shyam, Ghanashyam
// Print all the names
// Change Ram to Sitaram
// Change Ghanashyam to Gita
// Print all the names again
String[] names = new String[3];
names[0]="Ram";
names[1]="Shyam";
names[2]="Ghanshyam";
System.out.println(names[0]);
System.out.println(names[1]);
System.out.println(names[2]);
names[0]="Sitaram";
names[0]="Gita";
 
 
// Task 2
// Make an array of char called grades and allocate the size of 6
// add the grades Like, A,B,C,D,E, F
// print the first element of the grades
// print the last element of the grades
char[] grades =new char[6];
grades[0]='A';
//..
grades[5]='f';
//first index -> 0
//last index -> 5 -> size -1

//array loop condition 
//1. index <arr.length 
//2. index <= arr.length -1
for(int index =0; index < grades.length ; index ++){
    System.out.println("Index < grades.length; index");
    System.out.println("Element"+ grades[index]);

}
//Task 
//Make an array with the values
//22,33,44,55,66,77,101,202,403,899
//loop the array and print only the even numbers

//task 2
//Make an array with the values
//4,6,2,10,699,80,50,1
//Find the maximum and minimum element from this array

}
}