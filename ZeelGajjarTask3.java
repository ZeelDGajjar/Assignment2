package Assignment2;
import java.util.*;

/**
 *
 * @author 2474008
 */

public class ZeelGajjarTask3 {

    public static void main(String[] args) {
         
        Scanner total = new Scanner(System.in);
        double totalPrice = 0;  

        // loop to continue asking the questions until the input is 0
        while (true){

            System.out.print("Enter a product number (1-5 or 0 to exit): ");
            int productNum = total.nextInt();

            if (productNum != 0){
               
                System.out.print("Enter quantity sold: ");
                int quantitySold = total.nextInt();
               
                //to get the price based on the product number
                switch (productNum) {
                    case 1:
                        totalPrice += 2.98 * quantitySold;
                        break;
                    case 2:
                        totalPrice += 4.50 * quantitySold;
                        break;
                    case 3:
                        totalPrice += 9.98 * quantitySold;
                        break;
                    case 4:
                        totalPrice += 4.49 * quantitySold;
                        break;
                    case 5:
                        totalPrice += 6.87 * quantitySold;
                        break;
                    default:
                        System.out.println("Invalid product number.");
                        break;
                }

            } else {
                System.out.printf("Total retail value of all products sold is: $%.2f%n", totalPrice); //declaring the total price
                break;
            }  
        }

    }
}

                     
             


