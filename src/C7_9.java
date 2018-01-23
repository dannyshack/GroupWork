import java.util.Scanner;

public class C7_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for(int x = 0; x < 10; x++)
            numbers[x] = input.nextDouble();
        System.out.println("The minimum number is: " + min(numbers));       
    }
    public static double min(double[] array){        
        double min = array[0];
        for(double value: array ) {
            if (value < min)
                min = value;
        }
        return min;        
    }
}
