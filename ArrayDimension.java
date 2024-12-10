public class ArrayDimension {
    public static void main(String[]args){
        //the number of []after the datatype defines dimension of array
        //1.one dimension 
        int [] oneDarray =new int[2];
        //2. Two dimension 
        int [][] twoDarray =new int[2][4];
        //3. three dimension 
        int [][][] ThreeDarray =new int[2][1][2];

        //Two dimension representation 
        //int[2][4] -> first two is the  number of array/row
        //second 4 is the number of element in each inner array 
        //1 0 1 2 3
        //[0,0,0,0] -> 0 (arr[0])
        //[0,0,0,0] -> 1
        //]
        twoDarray[0][0]= 20;
        twoDarray[0][2]= 40;
        twoDarray[1][2]= 30;
        System.out.println("First elem of first arr is" +twoDarray[0][0]);

        //Task 
        //Make a 2D array called colors with the following data
        //[
        // [255,244,0]
        //[233,40,255]
        //[0,0,0]
        //[244,211,111]
        //[255,255,255]
        //]

            
                int[][] colors = {
                    {255, 244, 0},
                    {233, 40, 255},
                    {0, 0, 0},
                    {244, 211, 111},
                    {255, 255, 255},
                    
                };
                //Looping 2D array 
                for (int row=0; row < colors.length; row++) {
                    //for each inner array
                    //colors[row]-> colors[0] -. {255,244,0}
                    for(int column = 0; column < colors [row].length ; column++){
                    System.out.println(colors[row][column]+" ");
                }
                System.out.println();
            }
            //task 2
            //create the following array
            //[
            //["John","Doe","Ken"]
            //["Eric","Derek","Lisa"]
            //]
            //find which row has the value "Eric"
            //Print only the row with Eric,derek,ken and lisa
            
        }
    }  
    

