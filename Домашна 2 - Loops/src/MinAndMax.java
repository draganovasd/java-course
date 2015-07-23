import java.util.Scanner;
public class MinAndMax {


public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input numbers ");
        int max = Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int number = 0;
       
        while (true) {
            number = input.nextInt();
            if (number == 0) {
                break;
            }
           
            if (max < number) {
                max=number;
            }
            if( min>number){
            	min=number;
            }
        }
        System.out.println("Max Number: " + max);
        System.out.println("Max Number: " +min);
        input.close();
    }
}

