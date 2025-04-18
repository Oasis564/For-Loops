import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int number = 234;
        int sum = 0;

        while (number > 0) {
            int temp_number = number % 10;
            int cube = temp_number * temp_number * temp_number;
            System.out.println( temp_number);
            number = number / 10;
            sum = sum + cube;
        }

        System.out.println(sum);

        if(number == sum){
            System.out.println("this is an amstrong numbers");
        }
        else{
            System.out.println("this is not an amstrong number");
        }






    }
}
