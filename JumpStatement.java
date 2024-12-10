
public class JumpStatement {
    public static void main(String[]args){
        //break and continue
        //1. break -> exists the loop 
        for(int i=0; i<=5; i++){
            if(i==2){
                break; //break will exit current loop scope
            }
            System.out.println("Break loop"+i);
        }
        //break will exit current loop
        for(int outer =1; outer <=3; outer ++){
            if(outer ==2){
                break;
            }
                for(int inner =0; inner <2; inner++){
                    if(inner==1){
                        break; //this will only breakthe inner loop
                    }
                    System.out.println("Inner"+inner);
                }
                //Inner break exists here 
                System.out.println("Outer"+outer);
            }
            //outer break exists here

            //2. continue -> skips the current iteration/loop
            for(int i=10; i<=15; i++){
                if(i ==11){
                    continue; //continue will skip the loop
                    //meaning statement below will not be executed
                    //and goes to the next phase of loop
                }
                System.out.println("continue"+i);
            }
            //Task 1
            //USing do while print the following table
            //5*10=50
            //5*9=m45
            //..
            //5*0=0
            int mul =10;
            do{
                int product =mul +5;
                mul--;
            }while(mul >=0);

            //Task 2
            //using for loop and continue
            //loop from 1 - 20 and print the odd numbers
            for(int i=1; i<=20; i++){
                if(i% 2 !=0){
                    continue;
                }
                //print 
            }

            //Task 3
            //using while loop and continue 
            //loop from 20- 40 and print the even numbers

        }
    }

