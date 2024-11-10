package Assignment2;
import java.util.*;

/**
 *
 * @author 2474008
 */

public class ZeelGajjarTask1 {

    public static void main(String[] args) {

        // user input of 8,223,292,462 people and  0.858% per year
        Scanner input = new Scanner(System.in);
       
        System.out.println("Welcome to the world population calculator");  
       
        System.out.print("Enter the current world population: ");
        long population = input.nextLong();
       
        System.out.print("Enter the current growth rate: (e.g, 1.14% would be .0114) ");
        double growthRate = input.nextDouble();
       
        System.out.printf("Year %2s %2s", "Estimated Population", "Change fromPrior Year");
       
        //Calculate the total Population
        int year;
       
        for(year=0; year <= 75; year++) {

            long totalPopulation = (long) (population + population * growthRate);
           
            long differenceInPopulation = totalPopulation - population;
           
            System.out.printf("%d %5d %5d" , year, totalPopulation, differenceInPopulation);
           
            population = totalPopulation;
        }
    
    }
}

