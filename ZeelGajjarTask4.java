package Assignment2;

/**
 *
 * @author 2474008
 */

public class ZeelGajjarTask4 {

    public static void main(String[] args) {
          
        // First pattern
        int rows = 10;
        for(int ast= 0; ast <= rows; ast++){

            for(int ast1 = 0; ast1 < ast; ast1++){
                System.out.print("*");
            }

            for(int space = 10; space > ast ; space--){
                System.out.print(" ");
            }
            
            System.out.println("");

        }

        System.out.println();

        //Second pattern
        int rows2 = 1;
        for(int ast= 11; ast > rows2; ast--){

            for(int ast1 = 1; ast1 < ast; ast1++){
                System.out.print("*");
            }

            for(int space = 10; space > ast ; space--){
                System.out.print(" ");
            }
            
            System.out.println("");

        }

        System.out.println();

        //Third pattern
        for(int ast= 0; ast < rows; ast++){

            for(int ast1 = 0; ast1 < ast; ast1++){
                System.out.print(" ");
            }

            for(int space = 10; space > ast ; space--){
                System.out.print("*");
            }
            
            System.out.println("");

        }

        System.out.println("");

        //fourth pattern
        for(int ast= 10; ast >= rows2; ast--){

            for(int ast1 = 1; ast1 < ast; ast1++){
                System.out.print(" ");
            }

            for(int space = 11; space > ast ; space--){
                System.out.print("*");
            }
            
            System.out.println("");

        }

    }
}
