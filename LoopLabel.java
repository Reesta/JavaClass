public class LoopLabel {
    public static void main(String[] args) {
        //For loop used when iteration is fixed 
        for(int idx = 0; idx <=5;idx++){
            System.out.println("For loop" +idx);
        }
        //while loop,used when iteration is not fixed
        int number = 10;
        while(true){
            if (number % 3==0){
                break;
            }
            System.out.println("while loop" +number);
            number ++;
        }
       
        //loop label
        for(int first =0; first <=2;first ++){
            System.out.println("Outer loop"+first);
            for(int second =1;second <=5;second ++){
                System.out.println("Inner loop" +second);
                if(second == 2){
                break;
                }
            }
        }
    }    
}
