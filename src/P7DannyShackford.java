import java.util.Scanner;
public class P7DannyShackford {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be read: ");
        int numbers = input.nextInt();
        double[] array = new double[numbers];
        System.out.print("Enter "+numbers+" elements: ");
        elements(array);
        System.out.println("The average is "+average(array));
        list(array);
        
    }
    public static void elements(double[] array) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextDouble();
        
    }
    public static double average(double[] array) {
        double total = array[0];
        for(int i = 1; i < array.length; i++)
            total += array[i];
        return (total / array.length);
    }
    public static void list(double[] array) {
        System.out.println("Array "+java.util.Arrays.toString(array));
    }    
}
