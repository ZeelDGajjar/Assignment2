package Assignment2;

/**
 *
 * @author 2474008
 */


public class ZeelGajjarTask2 {
    public static void main(String[] args) {
          
        //Display the table title
        System.out.printf("Side 1\tSide 2\tHypotenuse \n");
        
        
        //Finding the value by through all the possible cases
        int side1, side2, hypotenuse;       
        
        for (side1 = 1; side1 <= 500; side1++){
            
            for (side2 = 1; side2 <= 500; side2++){
                
                for (hypotenuse = 1; hypotenuse <= 500; hypotenuse++){
                    
                    if ( Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(hypotenuse, 2)){
                
                    System.out.printf("%-7d %-7d %d \n", side1, side2, hypotenuse);
                    
                    }
                    
                }
               
            }
            
        }
            
            
           
    }
              
}